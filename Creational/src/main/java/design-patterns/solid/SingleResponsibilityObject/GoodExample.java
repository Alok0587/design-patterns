package com.solid.principles.SingleResponsibilityObject;

/*
This is good example because now we have seperated each responsibility
 */

public class GoodExample {

    public static void main(String[] args) {
        com.solid.principles.SingleResponsibilityObject.CreateConnection createConnection = new com.solid.principles.SingleResponsibilityObject.CreateConnection();
        createConnection.connect();

        com.solid.principles.SingleResponsibilityObject.LoadDB loadDatabase = new com.solid.principles.SingleResponsibilityObject.LoadDB();
        loadDatabase.loadData();
    }
}
