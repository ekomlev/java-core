package com.eduard.multithreading.echo.synchroniz;

public class Message {
    private String message;
    private boolean sent;

    public Message(String message, boolean sent) {
        this.message = message;
        this.sent = sent;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }

    public synchronized void say(String message) {  //with synchronized - Message object could use only 1 thread
        try {
            while (isSent()) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setMessage(message);
        this.setSent(true);
        System.out.println("Отправлено " + this.getMessage());
        notify();
    }

    public synchronized void reply() {
        try {
            while (!isSent()) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Получено " + this.getMessage());
        this.setSent(false);
        notify();
    }
}
