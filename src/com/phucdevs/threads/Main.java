package com.phucdevs.threads;

/**
 * @author Phuc.Le
 */
public class Main {

    public static void main(String[] args) {
        //startThreadWithExtendsThread();
        //synschronizedThreadsExtendsThread();
        //asynchronizedThreadsExtendsThread();

        //startThreadWithImplementsRunable();
        synchronizedThreadsImplementsRunnable();
        //asynchronizedThreadsImplementsRunable();
    }

    static void startThreadWithExtendsThread() {
        MultiThreadExtendsThread multiThreadExtendsThread = new MultiThreadExtendsThread(0);
        multiThreadExtendsThread.start();
    }

    static void startThreadWithImplementsRunable() {
        MultiThreadsImplementsRunnable multiThreadsImplementsRunnable = new MultiThreadsImplementsRunnable(0);
        Thread thread = new Thread(multiThreadsImplementsRunnable);
        thread.start();
    }

    static void synschronizedThreadsExtendsThread() {
        for (int i =0; i <= 3; i++) {
            MultiThreadExtendsThread multiThreadExtendsThread = new MultiThreadExtendsThread(i);
            multiThreadExtendsThread.run();
        }
    }

    static void asynchronizedThreadsExtendsThread() {
        for (int i =0; i <= 3; i++) {
            MultiThreadExtendsThread multiThreadExtendsThread = new MultiThreadExtendsThread(i);
            multiThreadExtendsThread.start();
        }
    }

    static void synchronizedThreadsImplementsRunnable() {
        for (int i = 0; i <= 3; i++) {
            MultiThreadsImplementsRunnable multiThreadsImplementsRunnable = new MultiThreadsImplementsRunnable(i);
            Thread thread = new Thread(multiThreadsImplementsRunnable);
            thread.run();
        }
    }

    static void asynchronizedThreadsImplementsRunable() {
        for (int i = 0; i <= 3; i++) {
            MultiThreadsImplementsRunnable multiThreadsImplementsRunnable = new MultiThreadsImplementsRunnable(i);
            Thread thread = new Thread(multiThreadsImplementsRunnable);
            thread.start();
        }
    }

}
