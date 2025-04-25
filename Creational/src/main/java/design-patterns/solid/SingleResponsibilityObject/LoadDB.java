package com.solid.principles.SingleResponsibilityObject;

public class LoadDB implements com.solid.principles.SingleResponsibilityObject.DB {

    @Override
    public void getName() {
        System.out.println("DB Name");
    }

    public void loadData() {
        System.out.println("Load DB");
    }
}
