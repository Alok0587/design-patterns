package com.Structural.Decorator;

public class SimpleCoffee implements com.Structural.Decorator.Coffee {

    @Override
    public double getPrice() {
        return 5.0;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
