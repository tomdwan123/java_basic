package com.phucdevs.threads;

/**
 * @author Phuc.Le
 */
public class MultiThreadsImplementsRunnable implements Runnable {

    private int threadNumber;

    public MultiThreadsImplementsRunnable(int threadNummber) {
        this.threadNumber = threadNummber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from thread " + threadNumber);

            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
            }
        }
    }
}
