package classWork5;

import java.io.*;
import java.net.Socket;

public class ClientHandler implements Runnable, Closeable {

    private static int cnt = 0;
    private int connectionId;
    private Socket socket;
    private DataInputStream is;
    private DataOutputStream os;

    public ClientHandler(Socket socket) throws IOException {
        this.socket = socket;
        is = new DataInputStream(socket.getInputStream());
        os = new DataOutputStream(socket.getOutputStream());
        cnt ++;
        connectionId = cnt;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String messageFromClient = is.readUTF();
                System.out.println("Received from client "+ connectionId + " : " + messageFromClient);
                os.writeUTF("From server " + messageFromClient);
                os.flush();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void close() throws IOException {
        os.close();
        is.close();

    }


}
