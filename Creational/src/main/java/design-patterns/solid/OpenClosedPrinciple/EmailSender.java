package com.solid.principles.OpenClosedPrinciple;

public class  EmailSender implements com.solid.principles.OpenClosedPrinciple.NotificationSender {
    @Override
    public void sendNotification(String notification){
        System.out.println(notification);
    }
}
