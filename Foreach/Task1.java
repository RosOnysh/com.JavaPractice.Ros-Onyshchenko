package Foreach;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};
      /*  for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

       */

        for (int a : array){
            System.out.print(a+ " ");
        }
    }
}