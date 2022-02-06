package Foreach;

public class task2 {
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};
        int suma = 0;
        for (int a:array){
            suma += a;
        }
        System.out.println(suma);
    }
}
