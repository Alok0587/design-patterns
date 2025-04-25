package com.solid.principles.interfaceSeggPrinciple;

public class GoodExample implements com.solid.principles.interfaceSeggPrinciple.Print {

    @Override
    public void print() {
        System.out.println("Printed GoodExample");
    }

    /*
    Here we don't have to implement irrelevant methods
     */
}
