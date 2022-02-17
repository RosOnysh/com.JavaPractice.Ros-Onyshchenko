package Overriding;

public class test4 {
    void abc (Animal a){
        System.out.println("a");
    }
    void abc (Mouse m){
        System.out.println("M");
    }

    public static void main(String[] args) {
        test4 t = new test4();
        Animal an = new Mouse();
        t.abc(an);
    }
}

class Animal{
    void getName(){
        System.out.println("Animal");
    }
}


class Mouse extends Animal{
    void getName(){
        System.out.println("");
    }
}