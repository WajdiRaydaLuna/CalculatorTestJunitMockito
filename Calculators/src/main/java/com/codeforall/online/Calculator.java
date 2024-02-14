package com.codeforall.online;
public class Calculator {
    private Brain brain;
    private Display display;

    public Calculator(Brain brain, Display display){
        this.brain = brain;
        this.display = display;
    }

    public void sum(int a, int b){
        display.show(brain.add(a, b));
    }
    public void substraction(int a, int b){
        display.show(brain.subtract(a, b));
    }
    public void multiplication(int a, int b){
      display.show(brain.multiply(a, b));
    }
    public void division(int a, int b){
        display.show(brain.divide(a, b));
    }

}
