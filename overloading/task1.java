package overloading;

public class task1 {
    int sum() {
        int result = 0;
        System.out.println("сумма всех чисел " + result);
        return result;
    }

    int sum(int a) {
        int result1 = a;
        System.out.println("сумма всех чисел " + result1);
        return result1;
    }
    int sum(int b, int c) {
        int result2 = b + c;
        System.out.println("сумма всех чисел " + result2);
        return result2;
    }
    int sum(int d, int f, int z ) {
        int result3 = d + f + z;
        System.out.println("сумма всех чисел " + result3);
        return result3;
    }
}

class task1Test{
    public static void main(String[] args) {
        task1 sumirovanie = new task1();
        sumirovanie.sum();
        sumirovanie.sum(4);
        sumirovanie.sum(3, 6);
        sumirovanie.sum(7,12,235);
    }

}

