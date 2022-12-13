package com.eduard.multithreading.echo.semaphore;

public class Main {

    public static void main(String[] args) {
        var message = new Message("Hey");
        new Echo(message);
        new Player(message);
    }
}
