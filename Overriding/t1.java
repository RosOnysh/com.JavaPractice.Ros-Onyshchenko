package Overriding;

public class t1 {
    public static void main(String[] args) {
Employee y = new Teacher();
        Teacher t = new Teacher();
        y.Eat();
       t.Eat();
    }
}

class Eda{}
class Frukr extends Eda{}

class Employee{
double Salary = 150;
String name = "Kolya";
int age;
int expirience;

 Eda Eat(){
    System.out.println("eat wor");
     Eda e = new Eda();
     return e;
}

void Sleep (){
    System.out.println("sleep");
}

}



class Teacher extends Employee{
    Eda Eat(){
        System.out.println("est wor w zakonie");
        Eda e = new Eda();
        return e;
    }

    int chtoUch;
    void Teach(){
        System.out.println("uchit");
    }
}



class a {
    Employee objectCreation(){
        return new Employee();
    }
}

class b extends a{
    @Override
    h objectCreation() {
        System.out.println("ok");
        return new h();
    }
}


class h extends Teacher{

}