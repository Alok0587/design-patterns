package com.creational.factory.origFactory;

public class MySqlDriver extends com.creational.factory.origFactory.DatabaseFactory {

    @Override
    public com.creational.factory.origFactory.Database getDatabase() {
        return new com.creational.factory.origFactory.MySqlDB() ;
    }
}
