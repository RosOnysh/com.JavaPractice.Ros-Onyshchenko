package Array;

// написать метод который принимает в параметр массив и выводит его максимальный и минимальный елемент
public class Zadachka {
    public static void MaxMin(double[] array) {

        // назначаю и максимуму и минимуму нулевой елемент
        double max = array[0];
        double min = array[0];
        // начиная с первого по последний елемент сверяю с максимумом и минимумом
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {     // если елемент будет больше максимума то он назначается максимумом
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min : " + min + " Max " + max);
    }

    public static void main(String[] args) {
        double[] array1 = {-2.6,11,7,4.6 ,2,2.1,-3 };
        MaxMin(array1);
    }
}
