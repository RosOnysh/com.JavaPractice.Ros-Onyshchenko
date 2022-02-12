 package overloading;

public class RunTime {

    RunTime(int id2, String name2, int age2) {
    /*    this(name2, age2);   // вызов конструктор внутри конструктора. RunTime вызываю RunTime оверлоад.
        id = id2; */
        this (id2, name2, age2, 45,null);

    }

    RunTime(String name3, int age3) {
     /*   name = name3;
        age = age3; */
        this (0, name3, age3, 45,null);
    }

    RunTime(int id4, String name4, int age4, double salary4, String department4) {
     /*   this(department4, age4);
        name = name4;
        salary = salary4; */

        id = id4;
        name = name4;
        age = age4;
        salary = salary4;
        department = department4;
    }

    int id;
    String name;
    int age;
    double salary;
    String department;

}

class RunTimeTest {
    public static void main(String[] args) {
        RunTime rn1 = new RunTime(1, "GAVGAV", 25);
        RunTime rn2 = new RunTime(3, "emaN", 50);
        System.out.println(rn1.name);
        RunTime emp2 = new RunTime("Petrow", 30);
        System.out.println(emp2.salary);


    }
}
