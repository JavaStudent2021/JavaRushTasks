package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            float seconds = numSeconds;
            boolean d = false;
            while (!d) {
                try {
                    if (numSeconds == 1) d = true;
                    System.out.println(numSeconds--);
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    System.out.println("Прервано!");
                    d =true;
                }
            }
            if (seconds < 3.5) System.out.println("Марш!");
        }
    }
}
