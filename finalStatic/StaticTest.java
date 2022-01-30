package finalStatic;

public class StaticTest {
    String name;
    int course;
   static  int count ;
   int a;

    public StaticTest(String name2, int course2) {
     count++;
        name = name2;
        course =  course2;
        System.out.println("Student create " + count);
    }

    public static void showCount(){
        System.out.println("Vsego Styudentow " + count);
    }

    public void showInfo(){
        System.out.println("Welcome to the stud class");
    }

    public static void main(String[] args) {

    }
}


