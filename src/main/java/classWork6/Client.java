package classWork6;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner in = new Scanner(System.in);
        Socket socket = new Socket("localhost",8189);
        ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream is = new ObjectInputStream(socket.getInputStream());

        while (in.hasNext()){
            String msg = in.next();
            os.writeObject(Message.of("Mike", msg));
            System.out.println(is.readObject());


        }

    }
}

