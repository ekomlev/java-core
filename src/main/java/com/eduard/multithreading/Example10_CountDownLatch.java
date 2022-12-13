package com.eduard.multithreading;

import java.util.concurrent.CountDownLatch;

public class Example10_CountDownLatch {

    public static void main(String[] args) {
        int keyAmount = 5;
        CountDownLatch countDownLatch = new CountDownLatch(keyAmount);
    }
}
