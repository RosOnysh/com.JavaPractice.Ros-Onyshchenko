package SuperProtected.p1;
import SuperProtected.task1;
public class test1 {
    public static void main(String[] args) {
        task1 c = new task1("Male");
        c.setName("Petya");
        c.setHeight(65);
        c.setAge(22);
        System.out.println(c.getName());
        System.out.println(c.getHeight());
        System.out.println(c.getAge());

    }
}
