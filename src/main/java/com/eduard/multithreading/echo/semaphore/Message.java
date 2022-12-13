package com.eduard.multithreading.echo.semaphore;

import java.util.concurrent.Semaphore;

public class Message {
    private String message;
    private Semaphore playerSemaphore = new Semaphore(1);
    private Semaphore echoSemaphore = new Semaphore(0); //initially no permits, thread will not work -  message.reply() in Echo class will not start

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void say(String message) {
        try {
            playerSemaphore.acquire(); //get playerSemaphore
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setMessage(message);
        echoSemaphore.release();  //add 1 permit to echoSemaphore
        System.out.println("[sent]: " + this.getMessage());
    }

    public void reply() {
        try {
           echoSemaphore.acquire(); //try to get semaphore, but initially permit = 0, so thread will be waiting till #29 code execute
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[received]: " + this.getMessage());
        playerSemaphore.release();
    }
}
