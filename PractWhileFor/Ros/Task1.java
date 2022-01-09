package com.PractWhileFor.Ros;
/**
 * 1. Написать программу высчитывающую факториал введённого целого числа.
 */
//1 * 2 * 3 * 4 * 5  = 5! FACTORIAL
public class Task1 {
    public static void main(String[] args) {
        int value = 5;
        int result = Factorial(value);
        System.out.println(result);
    }

    public static int Factorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i; // result = result * i;
        }
        return result;
    }

}
