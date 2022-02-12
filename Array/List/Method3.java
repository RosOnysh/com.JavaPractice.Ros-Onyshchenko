package Array.List;

import java.util.ArrayList;

public class Method3 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add(new String("Hello"));
        list1.add(new String("Poka"));
        list1.add(new String("Ok"));
        list1.add(new String("Privet"));
        for (String s : list1) {
            System.out.println(s + " ");
        }
        System.out.println(list1.lastIndexOf((new String("Poka"))));
        System.out.println(list1.size());
        System.out.println(list1.isEmpty());
        System.out.println( list1.contains("Poka"));
        System.out.println(list1.toString());
    }
}
