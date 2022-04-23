package com.phucdevs.threads;

/**
 * @author Phuc.Le
 */
public class MultiThreadThing extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
            }
        }
    }
}
