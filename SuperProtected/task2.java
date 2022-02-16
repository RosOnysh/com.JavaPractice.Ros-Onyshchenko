package SuperProtected;

public class task2 {

}

 class Human2 {
    Human2 (String n){
        this(n,null);
    }
    Human2 (String n,String s ){
        name = name;
        Surname = Surname;
    }


    String name = "Grysha";
    String Surname;
}


class Student2 extends Human2{
    Student2(){
        this(5);
        System.out.println("Hello");
       // super("Pet");    // вызов Parent конструктора.Super обращение к предку.
    }
    Student2(int i){
        super("Petya");
    }
    public static void main(String[] args) {
        Student2 s = new Student2();
    }
}
