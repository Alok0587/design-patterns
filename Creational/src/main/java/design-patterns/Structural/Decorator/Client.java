package com.Structural.Decorator;

public class Client {

    public static void main(String[] args) {
        com.Structural.Decorator.Coffee coffee=new com.Structural.Decorator.SimpleCoffee();
        com.Structural.Decorator.MilkDecorator milkDecorator=new com.Structural.Decorator.CoffeeDecorator(coffee);
        System.out.println(milkDecorator.getDescription()+" ->"+milkDecorator.getPrice());
    }
}
