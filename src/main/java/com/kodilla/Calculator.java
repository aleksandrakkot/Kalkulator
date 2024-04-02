package com.kodilla;

public class Calculator {
    public void add(int a, int b) {
        int result = a + b;
        System.out.println("Wynik dodawania: " + result);
    }
    public void subtract(int a, int b) {
        int result = a - b;
        System.out.println("Wynik odejmowania: " + result);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5, 3);
        calculator.subtract(8, 3);
    }
}
