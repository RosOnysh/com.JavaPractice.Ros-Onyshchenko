package BreakCont;

public class RegFor5OuterLoop {
    public void time() {

        OUTER:
        for (int chas = 0; chas <= 6; chas++) {
            MIDDLE:
            for (int minute = 0; minute <= 60; minute++) {
                if (chas >= 1 && minute == 10) {
                    break OUTER;
                }
                INNER:
                for (int secunda = 0; secunda <= 59; secunda++) {
                    if (secunda * chas > minute) {
                        continue MIDDLE;
                    }
                    System.out.println(chas + " : " + minute + " : " + secunda);
                }
                System.out.println("Konec outerLoop");
            }
        }
    }

    public static void main(String[] args) {
        RegFor5OuterLoop RF = new RegFor5OuterLoop();
        RF.time();
    }
}
