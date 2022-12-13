package com.eduard.multithreading;

public class Example7 {

    public static void main(String[] args) {
        var object = new Object();

        var t1 = new Thread(() -> {
            synchronized (object) { //T1 hold the monitor 
                System.out.println("T1 start");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("T1 end");
            }

        });

        var t2 = new Thread(() -> {
            synchronized (object) {
                System.out.println("T2 start");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("T2 end");
            }
        });

        t1.start();
        t2.start();
    }
}