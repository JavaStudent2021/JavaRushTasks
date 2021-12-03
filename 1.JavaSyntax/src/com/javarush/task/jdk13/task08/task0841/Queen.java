package com.javarush.task.jdk13.task08.task0841;

public class Queen {

    public static Worker[] workers;
    public static Warrior[] warriors;

    public static void main(String[] args) {
        populate();

        //напишите тут ваш код
        for (Worker f : workers) {
            f.sendForFood();
        }
        for (Warrior w : warriors) {
            w.sendToBattle();
        }

    }

    public static void populate() {
        workers = new Worker[800];
        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Worker();
        }

        warriors = new Warrior[70];
        for (int i = 0; i < warriors.length; i++) {
            warriors[i] = new Warrior();
        }
    }
}
