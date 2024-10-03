package classWork4;

public class AccountTest {

    public static void main(String[] args) {
        Account account = new Account(10000);
        System.out.println("Balance: " + account.getBalance());

        Runnable add = () -> {
                for (int i = 0; i < 100000; i++) {
                    account.increment(3);
                }
        };

        Runnable sub = () -> {
                for (int i = 0; i < 100000; i++) {
                    account.decrement(3);
                }
        };

        Thread t1 = new Thread(add);
        Thread t2 = new Thread(sub);
        t1.start();
        t2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Finish balance: " + account.getBalance());
    }
}
