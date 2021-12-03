package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile_1 = reader.readLine();
        String nameFile_2 = reader.readLine();
        BufferedReader reader1 = new BufferedReader(new FileReader(nameFile_1));
        BufferedReader reader2 = new BufferedReader(new FileReader(nameFile_2));
        ArrayList<String> arrayList_1 = new ArrayList<>();
        ArrayList<String> arrayList_2 = new ArrayList<>();

        String line = "";
        while ((line = reader1.readLine()) != null) {
            arrayList_1.add(line);
        }
        while ((line = reader2.readLine()) != null) {
            arrayList_2.add(line);
        }

        String a = "";
        String b_1 = "";
        String b = "";
        String b_2 = "";
        int t = 0;
        int i = 0;

        Integer sizeArr = arrayList_1.size() >= arrayList_2.size() ? arrayList_1.size() : arrayList_2.size();

        while (i <= sizeArr | t <= sizeArr) {
            try {
                a = arrayList_1.get(i);
            } catch (Exception e) {
                a = "";
            }

            try {
                b_1 = arrayList_2.get(t - 1);
            } catch (Exception e) {
                b_1 = "";
            }
            try {
                b = arrayList_2.get(t);
            } catch (Exception e) {
                b = "";
            }
            try {
                b_2 = arrayList_2.get(t + 1);
            } catch (Exception e) {
                b_2 = "";
            }


            if (a.equals(b) && a != "" && b != "") {
                lines.add(new LineItem(Type.SAME, a));
                t++;
            } else if (!a.equals(b_1) && !a.equals(b) && !a.equals(b_2)) {
                lines.add(new LineItem(Type.REMOVED, a));
            } else if (!a.equals(b_1) && !a.equals(b) && a.equals(b_2)) {
                i--;
                t++;
                lines.add(new LineItem(Type.ADDED, b));
            } else if (a == "" && b != "") {
                lines.add(new LineItem(Type.ADDED, b));
                t++;
            }else {
                t++;
            }
            i++;
            if (i == arrayList_1.size() & t == arrayList_2.size()) {
                break;
            }
        }
        reader.close();
        reader1.close();
        reader2.close();

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
