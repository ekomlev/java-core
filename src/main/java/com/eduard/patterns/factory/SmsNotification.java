package com.eduard.patterns.factory;

public class SmsNotification implements Notification {

    @Override
    public String notifyUser() {
        String notification = "sms notification";
        System.out.println("Sending an " + notification);

        return notification;
    }
}
