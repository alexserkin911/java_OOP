package classWork6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedDeque;

public class EchoServer {

    private boolean running;
    private ConcurrentLinkedDeque<SerialHandler> clients = new ConcurrentLinkedDeque<>();

    public EchoServer() {
        running = true;

        try (ServerSocket server = new ServerSocket(8189)) {
            System.out.println("Server start on port 8189");
            while (running) {
                System.out.println("Server is waiting connection");
                Socket socket = server.accept();
                SerialHandler handler = new SerialHandler(socket, this);
                clients.add(handler);
                new Thread(handler).start();
                System.out.println("Client accepted.");
                System.out.println("Client info: " + socket.getInetAddress());
            }

        } catch (Exception e) {
            System.out.println("Server crashed");
            e.printStackTrace();
        }
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void broadCast(Message msg) throws IOException {
        for (SerialHandler client : clients) {
            client.sendMessage(msg);
        }

    }

    public void kickMe(SerialHandler client){
        clients.remove(client);

    }

    public static void main(String[] args) {
        new EchoServer();
    }
}
