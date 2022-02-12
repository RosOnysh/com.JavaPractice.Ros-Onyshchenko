package overloading;

public class test1 {
    // сумирование чисел
    int sum(int a, int b, int c) {
        /* int result = b + c + g;
         return result; */
        return a + b + c;
    }

    int sredAr(int g, int d, int a){
      return sum(g, d, a) / 3;
    }


}
