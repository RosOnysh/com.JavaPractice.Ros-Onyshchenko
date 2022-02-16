package SuperProtected;

public class task1 {
    final String pol;

    public task1(String pol) {
        this.pol = pol;
    }
private boolean clever;
    public boolean isClever(){
        return clever;
    }

    ///////////////////////////////////
    private String name;

    public String getName() {
        StringBuilder sb = new StringBuilder(name);
        return name;
    }

    public void setName(String s) {
        name = "Grisha";
    }

    /////////////////////////////

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int i) {
        if (i > 0) {
            age = i;
        }
    }

    //////////////////////////////

    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int i) {
        if (i > 0) {
            height = i;
        }
    }
}

////////////////////////////
class test {
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
