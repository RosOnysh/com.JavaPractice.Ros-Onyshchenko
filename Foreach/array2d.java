package Foreach;

public class array2d {
    public static void main(String[] args) {
        int [][] array1 = {{3,7,8},{4,5},{9,4,4,6,8,3}};
     /*   for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] +" ");
            }
        }
      */


        for (int[]array2 : array1){
            for (int a : array2) {
                System.out.print(a + " " );
            }
        }

    }
    
        
}
