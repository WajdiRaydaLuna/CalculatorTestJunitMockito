package com.codeforall.online;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new Brain(), new Display());
        calculator.sum(5, 5);
        calculator.substraction(5, 5);
        calculator.multiplication(5, 5);
        calculator.division(5, 5);
    }
}
