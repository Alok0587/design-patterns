package com.Behavioural.Observer;

public class EmailSubscriber implements com.Behavioural.Observer.Observer {

    @Override
    public void update(String message) {
        System.out.println("Through email:"+message);
    }
}
