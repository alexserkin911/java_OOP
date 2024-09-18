package classWork2;

import java.io.File;
import java.io.FileNotFoundException;

public class Checked {

    public  static  boolean exist(String name) throws FileNotFoundException {
        File file = new File(name);
        if (!file.exists()){
            throw new FileNotFoundException(name);

        }
        return true;
    }
    public static void main(String[] args)  {
        try{
            System.out.println(exist("file.txt"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("not File");
        }
    }
}
