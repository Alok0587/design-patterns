package com.solid.principles.LiskovSubsPrinciple.BadExample;

/*
"Objects of a superclass should be replaceable with objects of a subclass without breaking the correctness of the program."
— Barbara Liskov
 */
class Sparrow implements com.solid.principles.LiskovSubsPrinciple.BadExample.Bird {
    public void fly() {
        System.out.println("Sparrow fly");
    }
}
class Ostrich implements com.solid.principles.LiskovSubsPrinciple.BadExample.Bird {
    public void fly() {

        /*
        Ostrich can't fly, So Here subclass is not irreplacable with super class
         */
        throw new UnsupportedOperationException();
    }
}
public class BadExample {

    public static void main(String[] args) {
        com.solid.principles.LiskovSubsPrinciple.BadExample.Bird bird=new Ostrich();
        bird.fly();
    }

}
