package While;

public class While5 {
    public static void main(String[] args) {
        OUTTER:
        for (int czas = 0; czas < 24; czas++) {
            int minute = 0;
            INNER:
            while (minute < 60) {
                System.out.println(czas + " : " + minute);
                minute++;
            }

        }
    }
}
