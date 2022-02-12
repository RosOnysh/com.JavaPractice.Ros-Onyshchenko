package overloading;

public class MethodOverloading2 {
    int sum(int a, int b){
        return a + b;
    }


    String sum(String a1, String b1){
        return a1 + b1;
    }

    protected void sum(int a, String b){
        System.out.println("Hello");
    }

}

class MethodOverloading2Test{
    public static void main(String[] args) {
        MethodOverloading2 mO = new MethodOverloading2();
       int a =  mO.sum(5,7);
        System.out.println(a);
       String s = mO.sum("hello","MY FRIEND");
        System.out.println(s);
    }
}
