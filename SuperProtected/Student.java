package SuperProtected;


import Inheritance.Human;

public class Student extends Human {
    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st.name);
        System.out.println(Student.salary);
        st.work();
        st.rest();

    }
}
