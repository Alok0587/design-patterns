package com.solid.principles.SingleResponsibilityObject;

public class CreateConnection implements com.solid.principles.SingleResponsibilityObject.DB {

    @Override
    public void getName() {
    }

    public void connect(){
        System.out.println("Connected to DB");
    }
}
