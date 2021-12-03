package com.javarush.task.task16.task1632;

public class Thread_3 implements Runnable{
    @Override
    public void run(){
        while (true){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Ура");
        }
    }
}
