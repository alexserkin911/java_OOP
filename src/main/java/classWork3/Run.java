package classWork3;

public class Run {
    public static void main(String[] args) {

        PhoneDirectory directory = new PhoneDirectory();


       directory.add("roy", 12316546);
        directory.add("roy", 123165546);
        directory.add("roy", 123156546);
        directory.get("roy");
    }
}
