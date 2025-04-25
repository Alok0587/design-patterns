package com.creational.factory.origFactory;

public class MySqlDB implements com.creational.factory.origFactory.Database {


    @Override
    public String getName() {
        System.out.println("MySqlDB");
        return "MySQL DB Server";
    }

    @Override
    public boolean isActive() {
        return true;
    }
}
