package String;

public class test4 {
}


class Employee{
    double salary;
    boolean IsManager;
    Employee(double salary, boolean IsManager){
        this.salary = salary;
        this.IsManager = IsManager;
    }
}


class TestEmployee{
    public static void main(String[] args) {
        Employee emp = new Employee(100.5,true);
        System.out.println("Он менеджер ?" + emp.IsManager + " его зарплата  : " + emp.salary);
    }
}