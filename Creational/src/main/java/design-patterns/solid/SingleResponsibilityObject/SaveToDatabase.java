package com.solid.principles.SingleResponsibilityObject;

public class SaveToDatabase implements com.solid.principles.SingleResponsibilityObject.DB {

    @Override
    public void getName() {
        System.out.println("DB Name");
    }
    public void save(){
        System.out.println("DB Save");
    }
}
