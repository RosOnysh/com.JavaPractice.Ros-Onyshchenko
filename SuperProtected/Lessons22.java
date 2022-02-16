package SuperProtected;

public class Lessons22 {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name);
        return name2;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course >= 1 && course < 5) {
            this.course = course;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade < 11) {
            this.grade = grade;
        }
    }

    public void ShowInfo() {
        System.out.println("Name : " + getName() + " Course : " + getCourse() + " Grade : " + getGrade());
    }
}

class testLessons22 {
    public static void main(String[] args) {
        Lessons22 st = new Lessons22();
        StringBuilder sb1 = new StringBuilder("Ivan");
st.getName();
st.getCourse();
st.getGrade();
st.ShowInfo();
    }
}


