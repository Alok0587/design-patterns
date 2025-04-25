package com.Structural.Decorator;

public class CoffeeDecorator extends com.Structural.Decorator.MilkDecorator {

    public CoffeeDecorator(com.Structural.Decorator.Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+2.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Coffee";
    }
}
