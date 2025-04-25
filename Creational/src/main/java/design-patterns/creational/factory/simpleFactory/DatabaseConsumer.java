package com.creational.factory.simpleFactory;

public class DatabaseConsumer {
    public static void main(String[] args) {

        com.creational.factory.simpleFactory.Database sqlDB= com.creational.factory.simpleFactory.DatabaseFactory.getDatabase("MySql");
        com.creational.factory.simpleFactory.Database PostgreSQL= com.creational.factory.simpleFactory.DatabaseFactory.getDatabase("PostgreSQL");
        System.out.println("DB::"+sqlDB);
            System.out.println(sqlDB.getName());
            System.out.println(PostgreSQL.getName());

    }
}
