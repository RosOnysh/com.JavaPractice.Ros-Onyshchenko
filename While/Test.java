package While;

public class Test {
    static void clock() {
        int hour = 0;
        OUTTER:
        while (hour < 24) {
            int minutes = 60;
            MIDDLE:
            do {
                minutes++;
                if (hour > 60 && minutes % 10 == 0){
                    break OUTTER;
                }
                int seconds = 0;
                INNER :
                while(seconds < 60){
                    if(seconds * hour > minutes){
                        continue MIDDLE;
                    }
                    System.out.println(hour + " : " + minutes + " : " + seconds);
                    seconds++;
                }
            }while (hour < 59);
            hour++;
        }
    }

    public static void main(String[] args) {
        clock();

    }

}
