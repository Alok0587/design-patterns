package com.creational.objectPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class DBConnectionPool {
    private final BlockingQueue<com.creational.objectPool.DBConnection> connectionPool;
    public DBConnectionPool(int capacity) {
        connectionPool = new LinkedBlockingQueue<>();
        for (int i = 0; i < capacity; i++) {
            connectionPool.add(new com.creational.objectPool.DBConnection("SQL Data Connection-"+i));
        }
    }
    public com.creational.objectPool.DBConnection getConnection() throws InterruptedException {
            return connectionPool.take();
    }
    public void returnConnection(com.creational.objectPool.DBConnection connection) {
        connectionPool.offer(connection);
    }
}
