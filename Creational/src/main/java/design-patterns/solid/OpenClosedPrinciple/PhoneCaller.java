package com.solid.principles.OpenClosedPrinciple;

public class PhoneCaller implements com.solid.principles.OpenClosedPrinciple.NotificationSender {

    @Override
    public void sendNotification(String to){
        System.out.println(to);
    }
}
