package abstact;

public class t1 {
    Jumpeble j1 = new Human();
    Jumpeble j2 = new Animal();
}


class  Human implements Jumpeble{
    @Override
    public void jump() {
        System.out.println("Human Jumps");
    }
}

class Animal implements Jumpeble{
    @Override
    public void jump() {
        System.out.println("Animal Jumps");
    }
}

interface Jumpeble{
void jump();
}


interface a2 {
    void abc();
}


interface b2 extends a2,Jumpeble{
    void def();
}
