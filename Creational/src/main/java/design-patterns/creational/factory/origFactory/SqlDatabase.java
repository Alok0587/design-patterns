package com.creational.factory.origFactory;

public class SqlDatabase implements com.creational.factory.origFactory.Database {
    @Override
    public String getName() {
        return "SQL Server";
    }

    @Override
    public boolean isActive() {
        return true;
    }
}
