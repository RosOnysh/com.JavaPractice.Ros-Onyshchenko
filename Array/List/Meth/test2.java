package Array.List.Meth;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class test2 {

    public static void main(String[] args) {
        ArrayList  all1 = new ArrayList<>();
        all1.add("One");
        all1.add("Two");
        all1.add("Three");
        all1.add("Four");
        all1.add("Five");

        for (Object o : all1){
            System.out.println("Number - " + o + " and length - " + ((String)o).length() );
        }















    }
}
