package classWork1.e;

public class A {
    protected int a;


    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public int calculateAndGet() {
        a++;
        return a;
    }
}
