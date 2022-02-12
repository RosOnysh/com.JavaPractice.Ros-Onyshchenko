package overloading;

public class MethodOverloading {
    void show(int i1) {
        System.out.println("Data type int");
        System.out.println(i1);

    }

    void show(boolean b1) {
        System.out.println("Data type boolean");
        System.out.println(b1);

    }


    void show(String s1) {
        System.out.println("Data type String");
        System.out.println(s1);

    }


    void show(String s, int a){
        System.out.println("String s :" + s + "int :" + a);
    }
    void show(int a, String s){
        System.out.println("Какой хороший день");
    }
}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 500;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String s = "Hello";
        mO.show(s);
        mO.show(s);
mO.show("privet",10);

    }
}