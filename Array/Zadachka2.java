package Array;

public class Zadachka2 {
    public static int[] sortirovka(int[] array1){
        int a;
        for (int i = 0; i <array1.length ; i++) {
            int min = array1[i];
            int index = i;
            for (int j = i + 1; j <array1.length ; j++) {
                if (array1[j] < min){
                    min = array1[j];
                    index = j;
                }
            }
            if(i != index){
                a = array1[i];
                array1[i] = min;
                array1[index] = a;
            }
        }
        return array1;
    }

    public static void main(String[] args) {
        int[] array = {5,8,1,-2,6,2};
        sortirovka(array);
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
