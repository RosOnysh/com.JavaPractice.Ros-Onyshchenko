package com.PractWhileFor.Ros;

/**
 * 2. Имеется число. Посчитать сумму цифр данного числа.
 */

public class Task2WHILE {
    public static void main(String[] args) {
        int value = 12345;
        int result = sum(value);
        System.out.println(result);
    }

    public static int sum(int value) {
        int result = 0;
        int CurrentValue = value;
while(CurrentValue != 0){
    result += CurrentValue % 10;
    CurrentValue /= 10;
}
        return result;
    }
}
