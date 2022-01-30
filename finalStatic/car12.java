package finalStatic;

public class car12 {
    String color = "blue";
    String engine = "V6";
}

class human{
    String name = "Ivan";
    car12 car = new car12();

    public static void main(String[] args) {
        human human1 = new human();
        human1.car = new car12();
        human1.car = new car12();
        human1.car.engine = "V8"; // мотор поменять можем
    }
}

// если был бы обьект car был бы final мы не смогли бы поменять ничего