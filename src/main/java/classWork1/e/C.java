package classWork1.e;

public class C extends B{
    private int c;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }


    @Override
    public int calculateAndGet() {
        return c * 2;
    }
}
