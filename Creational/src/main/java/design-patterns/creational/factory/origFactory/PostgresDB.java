package com.creational.factory.origFactory;

public class PostgresDB implements com.creational.factory.origFactory.Database {

    @Override
    public String getName() {
        return "Postgres DB Server";
    }

    @Override
    public boolean isActive() {
        return false;
    }
}
