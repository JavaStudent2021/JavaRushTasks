package com.javarush.task.task16.task1632;

public class Thread_2 implements Runnable{
    @Override
    public void run() {
        try {
            throw new InterruptedException();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }

    public Thread_2() {
    }
}
