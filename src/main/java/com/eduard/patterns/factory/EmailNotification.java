package com.eduard.patterns.factory;

public class EmailNotification implements Notification {

    @Override
    public String notifyUser() {
        String notification = "e-mail notification";
        System.out.println("Sending an " + notification);

        return notification;
    }
}
