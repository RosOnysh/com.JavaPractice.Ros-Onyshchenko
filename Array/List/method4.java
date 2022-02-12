package Array.List;

import java.util.*;

public class method4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        ArrayList<StringBuilder> list3 = list1;
        ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) list1.clone();
        //System.out.println(list1.get(0) == list2.get(0));
        //    list1.get(0).append("!!");
        //  System.out.println(list1.get(0));
     /*
        Object[] array1 = list1.toArray();
          for (Object o : array1){
            System.out.println(o + " ");
        }

        StringBuilder[] array2 = list1.toArray(new StringBuilder[10]);
        for (StringBuilder sb : array2){
            System.out.print(sb + " ");
        }



        StringBuilder[] array3 = {sb1, sb2, sb3};
        List<StringBuilder> list8 = Arrays.asList(array3);
        System.out.println(list8);
        array3[0] = new StringBuilder("!!!");
      */
    }
}