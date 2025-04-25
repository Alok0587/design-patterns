package com.creational.factory.origFactory;

public abstract class DatabaseFactory {
    public void verify(com.creational.factory.origFactory.Database database) {
           System.out.println(database.getName());
    }
    public abstract com.creational.factory.origFactory.Database getDatabase();
}
