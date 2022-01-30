package Switch;

public class test1 {

}

class Student {
    int grade;

    Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st = new Student(6);
        /*  if (st.grade == 2) {
            System.out.println("Bad grade");
        } else if (st.grade == 3) {
            System.out.println(" great grade");
        } else if (st.grade == 4) {
            System.out.println("good grade");
        } else if (st.grade == 5) {
            System.out.println("Excelent grade");
        } else {
            System.out.println("Grade ERRORS");
        }
       */

        switch (st.grade) {     //switch означает что я буду что то сравнивать и на основе результата сравнения буду выполнять дейсвтяи  что сравниваю пишу в скобках
            case 2:
                System.out.println("Bad grade");
                break;  // покидаю switch
            case 3:
                System.out.println("Great grade");
                break;
            case 4:
                System.out.println("Good grade");
            case 5:
                System.out.println("Excelent grade");
            default:
                System.out.println("ERROR");
        }
    }
}
