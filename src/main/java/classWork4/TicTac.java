package classWork4;

public class TicTac {

    public static void main(String[] args) {
        Object monitor = new Object();
        Runnable tic = () -> {
            while (true) {
                synchronized (monitor) {
                    System.out.print("(");
                    try {
                        Thread.sleep(500);
                        monitor.notify();
                        monitor.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Runnable tac = () -> {
            while (true) {
                synchronized (monitor) {
                    System.out.print(")");
                    try {
                        Thread.sleep(500);
                        monitor.notify();
                        monitor.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        };

        new Thread(tic).start();
        new Thread(tac).start();
    }
}
