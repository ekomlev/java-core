package com.eduard.patterns.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Factory Pattern
class NotificationFactoryTest {

    @Test
    void shouldCreateSmsNotification() {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        var actualNotification = notification.notifyUser();

        assertEquals(actualNotification, "sms notification");
    }

    @Test
    void shouldCreateEmailNotification() {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("EMAIL");
        var actualNotification = notification.notifyUser();

        assertEquals(actualNotification, "e-mail notification");
    }
}