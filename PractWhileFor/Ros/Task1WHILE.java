package com.PractWhileFor.Ros;

public class Task1WHILE {
    public static void main(String[] args) {
        int value = 5;
        int result = FactorialWhile(value);
        System.out.println(result);
    }

    public static int FactorialWhile(int value) {
        int result = 1;
        int i = 1;
        while (i <= value){
            result *= i;
            i++;
        }
        return result;
    }
}
