package Array.List.Meth;

import java.util.ArrayList;
import java.util.List;

public class RemoveAll {
    public static void main(String[] args) {
        ArrayList<String> all1 = new ArrayList<>();
        all1.add("One");
        all1.add("Two");
        all1.add("Three");
        all1.add("Four");
        all1.add("Five");
       //  System.out.println("All - " + all1);
      /*
        ArrayList<String> all2 = new ArrayList<>();
        all2.add("One");
        all2.add("Three");
        all2.add("Four");                                            // removeAll
       all2.add("Ten");
       all1.removeAll(all2);
       System.out.println("All - " + all2);
       boolean result = all1.containsAll(all2);
       System.out.println(result);



        List<String> subList = all1.subList(1,4); // не яляется отдельным от all1
        System.out.println("List - " + subList);
        subList.add("ten");

        System.out.println("All - " + all1);
        System.out.println("List - " + subList);

    Object[] array1 = all1.toArray();
    String [] array2 = all1.toArray(new String[5]);
    for (String s  : array2){
        System.out.println(s + " ");
    }

 */
List<String> list1 = List.of("odin","dwa","tri");
        System.out.println("List - " + list1);
List<String> list2 = List.copyOf(all1);
        System.out.println("List2 - " + list2);

    }
}
