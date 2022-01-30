package Switch;

public class Employee {
    public static void main(String[] args) {
        switch ("Tuesday") {
            case "Monday":


            case "Tuesday":

            case "Wednesday":

            case "Thursday":

            case "Friday":
                System.out.println("Work 18:00");
                break;
            case "Saturday":
                System.out.println("Work 13:00");
                break;
            case "Sunday":
                System.out.println("Work 13:00");
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
