package com.eduard.multithreading.echo.synchroniz;

public class Main {

    public static void main(String[] args) {
        var message = new Message("Hey", false);
        new Echo(message);
        new Player(message);

    }
}
