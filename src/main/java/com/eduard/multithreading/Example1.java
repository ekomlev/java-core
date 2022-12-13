package com.eduard.multithreading;

public class Example1 {

    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        System.out.println(myThread1.getState().name()); //STATE of the thread = NEW
        MyThread2 myThread2 = new MyThread2();

        myThread1.start();
        System.out.println(myThread1.getState().name()); //STATE of the thread = RUNNABLE

        myThread2.start();
    }
}

class MyThread2 extends Thread {

    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}

class MyThread1 extends Thread {

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}
