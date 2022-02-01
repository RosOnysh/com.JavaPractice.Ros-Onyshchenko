package While;

public class DoWhile2 {
    public static void main(String[] args) {

        int czas = 0;

        OUTTER:
        do {
            int minutes = 0;

            MIDDLE:
            while (minutes < 59) {
                System.out.println(czas + " : " + minutes);
                minutes++;
            }
            czas++;


        }
        while (czas < 24);
    }
}
