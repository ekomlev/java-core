package com.eduard.multithreading;

public class Example5 {

    public static void main(String[] args) {
        var myThread1 = new Thread(new MyThread1());
        myThread1.setDaemon(true);  //that means that main thread won't wait it and will stop it when main is ready to end.
        myThread1.start();

        System.out.println("Main end"); //main thread will wail for ending 2 threads myThread1 and myRunnable1 and only then will execute owns commands
    }
}