package Foreach;

public class test4 {
    public static void main(String[] args) {


        String[] array1 = {"Privet", "Poka", "Okey"};
        for (String s1 : array1 ){
            s1 = new String("hello ");
          
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}