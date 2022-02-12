package Array;

public class task5 {
    public static void main(String[] args) {
        int[] array1 = {1,9,3,-8,5,0,7,4};
        int[] array2 = {1,9,3,-8,5,0,7,4};
        int[]array3 = array2;
        array1[0] = 2;
        array2[5-2] = 3;
       // System.out.println(array1 == array2);
        System.out.println(array3.equals(array2));
    }
}
