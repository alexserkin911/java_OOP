package classWork2;

public class RunTimes {

    public static void main(String[] args) {
        try {
            int x = 12 / 0;
//            int[] a = new int[3];
//            int b = a[7];
//            int[] c = null;
//            int[] e = c[7];

        } catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("На ноль делить нельзя");
        } catch (IndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("выход за границы массива");
        } catch (NullPointerException e){
            e.printStackTrace();

        } finally {
            System.out.println("Must do it");
        }
    }
}
