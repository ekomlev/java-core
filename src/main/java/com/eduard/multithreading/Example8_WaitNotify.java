package com.eduard.multithreading;

public class Example8_WaitNotify {
    public static Object monitor = new Object();
    public static char currentChar = 'A';

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    synchronized (monitor) {
                        while (currentChar != 'A') {
                            monitor.wait(); //free monitor and wait
                        }
                        System.out.println('A');
                        currentChar = 'B';
                        monitor.notifyAll(); //resume all threads that were waiting
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    synchronized (monitor) {
                        while (currentChar != 'B') {
                            monitor.wait();
                        }
                        System.out.println('B');
                        currentChar = 'C';
                        monitor.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    synchronized (monitor) {
                        while (currentChar != 'C') {
                            monitor.wait();
                        }
                        System.out.println('C');
                        currentChar = 'A';
                        monitor.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

    }
}
