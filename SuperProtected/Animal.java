package SuperProtected;

public class Animal {
    public Animal() {
        System.out.println("I am Animal");
    }

    int eys;

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drsnks");
    }
}


class Pet extends Animal {
    Pet() {
        System.out.println("I am pet");
        eys = 2;
    }
    String name;
    int tail = 1;
    int paw = 4;



    public void run(){
        System.out.println("Pet runs");
    }


    public void jump(){
        System.out.println("Pet jumps");
    }
}




class Dog extends Pet{
    Dog(String name){
        this.name = name;
        System.out.println("I am Dog and my name is " + name);
    }

    public void Play(){
        System.out.println("Dog plays");
    }
}


class Cat extends Pet{
    Cat(String name){
        this.name = name;
        System.out.println("I am Cat and my name is " + name);
    }
    public void sleep(){
        System.out.println("Cat sleeps");
    }
}

class Test{
    public static void main(String[] args) {
        Dog d = new Dog("Sebek");
        System.out.println("Количество лап у Сембека : " + d.paw);
        Cat c = new Cat("Pan Kit");
      c.sleep();
    }
}