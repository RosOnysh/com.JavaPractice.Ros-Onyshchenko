package Array;

import java.util.Arrays;

public class Taskes4 {
    public static void main(String[] args) {
        int[] array1 = {1, 9, 3, -4, 5, 12, -2};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
        }
        System.out.println();
        int index1 = Arrays.binarySearch(array1,-4);
        System.out.println(index1);


    }
}
