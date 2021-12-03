package com.javarush.task.task16.task1632;

public class Thread_4 implements Runnable, Message {
    @Override
    public void showWarning() {
        System.out.println("Stop");
        Thread.interrupted();
    }

    @Override
    public void run() {

    }

    public Thread_4() {
    }
}
