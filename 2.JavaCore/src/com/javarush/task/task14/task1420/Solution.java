package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int x = Integer.parseInt(reader.readLine());
            int y = Integer.parseInt(reader.readLine());
            System.out.println("nod - " + nod(Math.abs(x), Math.abs(y)));
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    public static int nod(int x, int y) {
        ArrayList<Integer> list_x = new ArrayList<>();
        ArrayList<Integer> list_y = new ArrayList<>();
int res=1;
        boolean bl = false;
        int d;
        d = x;
        while (!bl) {
            bl = true;
            if (d % 2 == 0) {
                d = d / 2;
                list_x.add(2);
                bl = false;
            }
        }
        int s = y;
        bl = false;
        while (!bl) {
            bl = true;
            if (s % 2 == 0) {
                s = s / 2;
                list_y.add(2);
                bl = false;
            } else if (s % 3 == 0) {
                s = s / 3;
                list_y.add(3);
                bl = false;
            }
        }

        for (int i = 0; i < list_x.size(); i++) {
            System.out.print(" - "+ list_x.get(i));
            res *=list_x.get(i);
        }
        return res;
    }
}
