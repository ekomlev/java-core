package com.eduard.multithreading;

import java.util.SortedMap;

public class Example3 {

    //1st Thread
    public static void main(String[] args) {

        //2nd Thread (with anonymous interface)
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Hello");
            }
        }).start();

        //3rd Thread (with lambda)
        new Thread(() -> System.out.println("Hi!")).start();
    }
}
