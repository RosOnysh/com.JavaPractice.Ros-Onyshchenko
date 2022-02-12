package Array.List;

import java.util.ArrayList;

public class Method {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(new StringBuilder("Hello"));
        list1.add(new StringBuilder("Poka"));
        list1.add(new StringBuilder("Ok"));
        list1.add(new StringBuilder("Privet"));
        list1.add(1, new StringBuilder("Privet"));
        for (StringBuilder s : list1) {
            System.out.print(s + " ");
        }
        System.out.println();
        // for (int i = 0; i < list1.size(); i++) {
        // System.out.println(list1.get(i));
        //}
       //  list1.remove("Poka");


        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("Petrov"));
        list2.add(new StringBuilder("Sidorov"));

        list1.addAll(list2);
        for (StringBuilder s : list1) {
            System.out.print(s + " ");
        }
list2.get(1).append("!");
        System.out.println();
        for (StringBuilder s : list1){
            System.out.print( s + " ");
        }

    }
}
