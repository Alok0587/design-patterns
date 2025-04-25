package com.solid.principles.OpenClosedPrinciple;


/*
Now we can extend and add functionality for different types of sender.
 */
public class GoodExample{
    com.solid.principles.OpenClosedPrinciple.NotificationSender notificationSender=new com.solid.principles.OpenClosedPrinciple.EmailSender();

    public void sendNotificationSender(String message) {
        notificationSender.sendNotification(message);
    }
}
