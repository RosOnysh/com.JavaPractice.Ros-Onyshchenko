package Array.List;

import java.util.ArrayList;

public class method2 {
    public static void main(String[] args) {
        ArrayList <StringBuilder> list1 = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Poka");
        StringBuilder sb3 = new StringBuilder("Privet");
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        for (int i = 0; i < list1.size(); i++) {
            list1.get(i).append("!!!");
        }

for (StringBuilder sb : list1){
    System.out.println(sb + "");
}
        System.out.println();
list1.remove(2);
for (StringBuilder sb : list1){
    System.out.println(sb + " ");
}
    }
}
