package com.creational.factory.origFactory;

public class DatabaseConsumer {
    public static void main(String[] args) {


        com.creational.factory.origFactory.Database sb = (com.creational.factory.origFactory.Database) new com.creational.factory.origFactory.SqlDriver().getDatabase();
        System.out.println(sb.getName());
    }
}
