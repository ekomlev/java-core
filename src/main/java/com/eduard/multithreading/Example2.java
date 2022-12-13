package com.eduard.multithreading;

public class Example2 {
    public static void main(String[] args) {
        Thread myRunnableThread3 = new Thread(new MyThread3());
        Thread myRunnableThread4 = new Thread(new MyThread4());

        myRunnableThread3.start();
        myRunnableThread4.start();
    }
}

class MyThread3 implements Runnable {

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread4 implements Runnable {

    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}
