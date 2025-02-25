package com.creational.factory.origFactory;

public class SqlDriver extends DatabaseFactory{

    @Override
    public Database getDatabase() {
        return new SqlDatabase() ;
    }
}
