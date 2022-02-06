package Foreach;

public class test3 {
    public static void main(String[] args) {
        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        String[] exams = {"Math", "Economic", "Geographia "};

        for (String s1 : students) {
            for (String s2 : exams){
                System.out.println(s1 + " " + s2);
            }
        }
    }
}
