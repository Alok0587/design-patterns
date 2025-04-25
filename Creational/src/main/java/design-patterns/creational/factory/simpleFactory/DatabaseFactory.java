package com.creational.factory.simpleFactory;

public class DatabaseFactory {
    public static com.creational.factory.simpleFactory.Database getDatabase(String Name) {
        return switch (Name) {
            case "MySql" -> new com.creational.factory.simpleFactory.MySqlDB();
            case "PostgreSQL" -> new com.creational.factory.simpleFactory.PostgresDB();
            case "SqlServer" -> new com.creational.factory.simpleFactory.SqlDatabase();
            default -> throw new IllegalArgumentException("Unknown database type");
        };
    }
}
