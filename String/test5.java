package String;

import java.util.Locale;

public class test5 {
    public static void main(String[] args) {
        String s1 = "PRIVET";
        String s2 = s1.toLowerCase();
        System.out.println(s2);

        String s3 = "meow";
        String s4 = s3.toUpperCase();
        System.out.println(s4);


        boolean b = s1.contains("T");
        System.out.println(b);
    }
}
