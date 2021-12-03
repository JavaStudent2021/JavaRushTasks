package com.javarush.task.jdk13.task08.task0831;

import java.util.Arrays;

/* 
Любимые настолки
*/

public class Solution {

    public static BoardGame[] collection = new BoardGame[10];

    public static void main(String[] args) {
        BoardGame chess = new BoardGame();
        chess.name = "Шахматы";
        collection[0] = chess;

        //напишите тут ваш код
        BoardGame a = new BoardGame();
        a.name = "a";
        collection[1] = a;
        BoardGame b = new BoardGame();
        b.name = "b";
        collection[2] = b;
        BoardGame c = new BoardGame();
        c.name = "c";
        collection[3] = c;
        BoardGame d = new BoardGame();
        d.name = "d";
        collection[4] = d;
        BoardGame f = new BoardGame();
        f.name = "f";
        collection[5] = f;
        BoardGame g = new BoardGame();
        g.name = "g";
        collection[6] = g;
        BoardGame h = new BoardGame();
        h.name = "h";
        collection[7] = h;
        BoardGame j = new BoardGame();
        j.name = "j";
        collection[8] = j;
        BoardGame k = new BoardGame();
        k.name = "k";
        collection[9] = k;


        System.out.println(Arrays.toString(collection));
    }
}