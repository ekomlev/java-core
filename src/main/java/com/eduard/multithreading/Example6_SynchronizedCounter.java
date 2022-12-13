package com.eduard.multithreading;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class Example6_SynchronizedCounter {

    public static void main(String[] args) {
        var counter = new Counter(0);

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

        System.out.println("Counter X: " + counter.getX()); //should be 0 (as 1st thread increased N times and 2nd decreased N times back
    }
}

@AllArgsConstructor
@Getter
class Counter {
    private int x;

    public synchronized void inc() {
        //here 3 operations: read, change, write.
        // Without synchronization. It may occur that on 2nd step of changing by 1st thread will read 0 and increase +1 (but didn't manage to write the result),
        // 2nd thread will get 0 integer, 1st thread didn't have enough time to write the result
        // with synchronized - 2nd thread will wait till 1st thread well finish this method. During waiting - 2nd thread state = BLOCKED
        this.x++;
    }

    public synchronized void dec() {
        this.x--;
    }
}