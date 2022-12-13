package com.eduard.multithreading;

public class Example4 {

    public static void main(String[] args) {
        var myThread1 = new Thread(new MyThread1());
        myThread1.start();

        var myRunnable1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
        myRunnable1.start();

        try {
            myThread1.join(); //will join this thread to main thread
            myRunnable1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main end"); //main thread will wail for ending 2 threads myThread1 and myRunnable1 and only then will execute owns commands
    }
}