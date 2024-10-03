package classWork4;

public class Account {
    private volatile int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void increment(int value){
        synchronized (this){
            balance += value;
        }
    }

    public void decrement(int value){
        synchronized (this){
            if(wrongBalance()){
                throw new RuntimeException("Negate balance. Balance = " + balance);
            }
            balance -= value;
        }
    }

    private boolean wrongBalance() {
        return false;
    }
}
