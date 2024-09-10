package classWork1.interfaces;

import classWork1.e.A;
import classWork1.e.B;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        UserService s1 = new DBUserServiceImpl();
        UserService s2 = new FileUserServiceImpl();

        Object o1 = new A();
        Object o2 = new B();

        System.out.println(o1 instanceof A);
        System.out.println(o2 instanceof A);
        System.out.println(o2 instanceof B);

        System.out.println(((A)o1).calculateAndGet());

        FileMessage<String> fileMessage = new FileMessage<>("lol.txt");
        fileMessage.write("Hello world");

        System.out.println(fileMessage.read());
    }
}
