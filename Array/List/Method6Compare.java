package Array.List;

import java.util.Arrays;

public class Method6Compare {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 5};


        char[] array3 = {'p', 'r', 'i', 'v', 'e', 't'};
        char[] array4 = {'p', 'r', 'i', 'v', 'i', 'v', 'k', 'a'};


        System.out.println(Arrays.compare(array2,array1));
    }
}