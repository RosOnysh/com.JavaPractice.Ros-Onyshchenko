package com.PractWhileFor.Ros;

public class Task2FOR {
    public static void main(String[] args) {
        int value = 12345;
        int result = sumFor(value);
        System.out.println(result);
    }
public static int sumFor(int value) {
    int result = 0;
    for (int CurrentValue = value; CurrentValue !=0 ; CurrentValue /= 10) {
        result += CurrentValue % 10;
    }
    return result;
}
}
