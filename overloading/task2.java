package overloading;

public class task2 {

    task2(int StudentId2, String Name2, String Surname2, int Course2, double MathAverageGrade2, double EconomicAverageGrade2, double ForeignLanguageAverageGrade2) {
        StudentId = StudentId2;
        Name = Name2;
        Surname = Surname2;
        Course = Course2;
        MathAverageGrade = MathAverageGrade2;
        EconomicAverageGrade = EconomicAverageGrade2;
        ForeignLanguageAverageGrade = ForeignLanguageAverageGrade2;
    }

    task2(int StudentId3, String Name3, String Surname3, int Course3) {
        this(StudentId3, Name3, Surname3, Course3, 0, 0, 0);
        // вызов первого конструктора в теле второго.И замена недостающих параметров нулями
    }

    task2() {

    }    // конструктор без параметров и тела.Дефолтные параметры будет показыватью

    int StudentId;
    String Name;
    String Surname;
    int Course;
    double MathAverageGrade;
    double EconomicAverageGrade;
    double ForeignLanguageAverageGrade;
}


class task2Test {
    double cpedAverage(task2 st) {
        double cpedOcenka = (st.MathAverageGrade + st.EconomicAverageGrade + st.ForeignLanguageAverageGrade);
        System.out.println("Средняя Оценка СТудента  : " + st.Name + st.Surname + st.Course + cpedOcenka);
        return cpedOcenka;
    }

    public static void main(String[] args) {
        task2 st1 = new task2();
        st1.StudentId = 1;
        st1.Name = "Meow ";
        st1.Surname = "Baski ";
        st1.Course = 1;
        st1.MathAverageGrade = 3;
        st1.EconomicAverageGrade = 3;
        st1.ForeignLanguageAverageGrade = 3;


        task2 st2 = new task2(2, "Aleks ", "Petrow ", 1);
        st2.MathAverageGrade = 3;
        st2.EconomicAverageGrade = 3;
        st2.ForeignLanguageAverageGrade = 3;

        task2 st3 = new task2(4, "anton ", "biba ", 1, 1, 1, 3);

        task2Test sTest = new task2Test();
        sTest.cpedAverage(st1);
        sTest.cpedAverage(st2);
        sTest.cpedAverage(st3);
    }
}