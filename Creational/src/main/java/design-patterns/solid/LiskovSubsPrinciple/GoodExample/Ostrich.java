package com.solid.principles.LiskovSubsPrinciple.GoodExample;


/*
This is good Example here because Ostrich can be substituted for Bird
 */
public class Ostrich implements com.solid.principles.LiskovSubsPrinciple.GoodExample.Bird {
    public void walk(){
        System.out.println("Ostrich walk");
    }
}
