package classWork1.e;

public class B extends A {
    protected int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int calculateAndGet(){
        return super.calculateAndGet() + ++b;
    }
}
