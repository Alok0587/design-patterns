package com.Structural.Decorator;

public abstract class MilkDecorator implements com.Structural.Decorator.Coffee {
    private final com.Structural.Decorator.Coffee decoratedCoffee;
    public MilkDecorator(com.Structural.Decorator.Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getPrice() {
        return 0.5;
    }
}
