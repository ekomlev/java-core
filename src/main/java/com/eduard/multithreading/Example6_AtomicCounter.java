package com.eduard.multithreading;

import lombok.Getter;

import java.util.concurrent.atomic.AtomicInteger;

public class Example6_AtomicCounter {

    public static void main(String[] args) {
        var counter = new AtomicCounter();

        var t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.inc();
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        var t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                counter.dec();
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Counter X: " + counter.getCount()); //should be 0 (as 1st thread increased N times and 2nd decreased N times back
    }
}

@Getter
class AtomicCounter {
    private final AtomicInteger count = new AtomicInteger();


    public AtomicCounter() {
        this.count.set(0);
    }

    public synchronized void inc() {
        count.incrementAndGet();
    }

    public synchronized void dec() {
        count.decrementAndGet();
    }
}