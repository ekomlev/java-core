package com.eduard.multithreading;

import lombok.AllArgsConstructor;

import java.util.concurrent.Semaphore;

public class Example9_Semaphore {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);

        for (int i = 0; i < 6; i++) {
            new Thread(new SemaphoreThread(semaphore, i)).start();
        }
        
    }
}

@AllArgsConstructor
class SemaphoreThread implements Runnable {
    Semaphore semaphore;
    int i;

    @Override
    public void run() {
        try {
            System.out.println("Thread " + i + " is waiting for the semaphore");
            semaphore.acquire();

            //code below will be synchronized with the count of threads == count permits (2)
            System.out.println("Thread " + i + " is acquired the semaphore");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Thread " + i + " released the semaphore");
            semaphore.release();
        }
    }
}
