package classWork6;

import java.io.*;
import java.net.Socket;


public class SerialHandler implements Closeable, Runnable{
    private static int cnt = 0;
    private final String userName;
    private final ObjectInputStream is;
    private final ObjectOutputStream os;
    private boolean running;

    private final EchoServer server;

    public SerialHandler(Socket socket, EchoServer server) throws IOException {
        os = new ObjectOutputStream(socket.getOutputStream());
        is = new ObjectInputStream(socket.getInputStream());
        cnt++;
        userName = "user#" + cnt;
        running = true;
        this.server = server;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public void run() {
        while (running) {
            try {
                Message message = (Message) is.readObject();
                server.broadCast(message);
            } catch (Exception e) {
                System.err.println("Exception while read");
                break;
            }
        }
    }

    public void sendMessage(Message message) throws IOException {
        os.writeObject(message);
        os.flush();

    }

    @Override
    public void close() throws IOException {
        os.close();
        is.close();

    }
}
