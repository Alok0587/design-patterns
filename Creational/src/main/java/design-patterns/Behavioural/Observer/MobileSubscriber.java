package com.Behavioural.Observer;

public class MobileSubscriber implements com.Behavioural.Observer.Observer {

    @Override
    public void update(String message) {
        System.out.println("News on Mobile:"+message);
    }

}
