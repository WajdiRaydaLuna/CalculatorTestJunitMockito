package com.codeforall.online;

public class Display {
    public void show(int result){
        if (result < 0){
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        System.out.println("Result: " + result);
    }
}
