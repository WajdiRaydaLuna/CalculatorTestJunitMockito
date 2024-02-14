package com.codeforall.online;

public class Brain {
public int add(int a, int b){
    try {
        if (a < 0 || b < 0){
            throw new IllegalArgumentException("Negative numbers are not allowed" );
        }
        return a + b;
    } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
        throw  e;
    }
}
    public int subtract(int a, int b){
    if (a < 0 || b < 0){
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        return a - b;
    }
    public int multiply(int a, int b){
    if (a < 0 || b < 0){
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        return a * b;
    }
    public int divide(int a, int b){
    if (a < 0 || b < 0){
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
    if (b == 0){
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
