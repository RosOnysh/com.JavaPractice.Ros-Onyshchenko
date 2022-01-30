package Switch.Month;

public class Month {

    public static void dayQuantitiy(int m) {
        switch (m) {
            case 2:
                System.out.println("Количество дней 29");
                break;
            case 3:
            case 6:
            case 9:
            case 11:
                System.out.println("Количество дней 30");
                break;

            case 1:
            case 4:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Количество дней 31");
                break;

            default:
                System.out.println("Месяца с таким номером не существует");
        }
    }

    public static void main(String[] args) {
        Month.dayQuantitiy(0);
        dayQuantitiy(3);
        Month.dayQuantitiy(5);
        dayQuantitiy(7);
        Month.dayQuantitiy(-5);


    }
}

