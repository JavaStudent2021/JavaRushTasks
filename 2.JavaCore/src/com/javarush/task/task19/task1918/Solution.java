package com.javarush.task.task19.task1918;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Знакомство с тегами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = "C:\\DiskD\\jav\\er3.txt"; //reader.readLine();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(nameFile));
        String teg = args[0];
        String text = "";
        while (bufferedReader.ready()) {
            text += bufferedReader.readLine();
        }
        bufferedReader.close();
        reader.close();

        String start_line = "<" + teg;
        Pattern pattern1 = Pattern.compile(start_line);
        Matcher matcher1 = pattern1.matcher(text);

        String end_line = "</" + teg;
        Pattern pattern2 = Pattern.compile(end_line);
        Matcher matcher2 = pattern2.matcher(text);

        ArrayList<Integer> start = new ArrayList<>();
        ArrayList<Integer> end = new ArrayList<>();

        while (matcher1.find()) {
            start.add(matcher1.start());
        }
        while (matcher2.find()) {
            end.add(matcher2.start());
        }
        if (start.size() == end.size()) {
            System.out.println(found_Tag(text, teg));
            //found_Tag(text, teg);
        } else {
            System.out.println("Є не закриті теги");
        }

    }


    public static String found_Tag(String text, String teg) {
        String start_line = "<" + teg;
        String end_line = "</" + teg;
        String line = "";
        int r = 0;
        int s = 0;
        int x = 0;
        int y = 0;
        int map_Char_start = 0;
        int map_Char_end = 0;
        String res = "";
        String d = "";

        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> arrayText = new ArrayList<>();
        List<Integer> arrayX = new ArrayList<>();
        List<Integer> arrayY = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            line += text.charAt(i); // додаю по символу
            if (line.endsWith(start_line)) {
                map_Char_start = (i - (start_line.length() - 1));
                //System.out.println("start - " + map_Char_start);
                arrayX.add(map_Char_start);
                r++;
            }
            if (line.endsWith(end_line)) {
                map_Char_end = (i - (start_line.length()));
                //System.out.println("end - " + map_Char_end);
                arrayY.add(map_Char_end);
                try {
                    x = arrayX.size() - ++s;
                    x = arrayX.get(x);
                } catch (Exception e) {
                    x = arrayX.get(0);
                }

                try {
                    y = arrayY.size() - 1;
                    y = arrayY.get(y);
                } catch (Exception e) {
                    y = arrayY.get(0);
                }
                System.out.println(arrayX);
                System.out.println(arrayY);
                if (arrayX.size() == arrayY.size()) {

                    arrayX.clear();
                    arrayY.clear();

                    arrayText.add(text.substring(x, y + end_line.length() + 1) + "\n");
                    for (int j = arrayText.size() - 1; j >= 0; j--) {
                        res += arrayText.get(j);
                    }
                    res += d;
                    arrayText.clear();
                    d = text.substring(x, y + end_line.length()+1) + "\n"; d = "";
                    //System.out.println(d);
                } else {
                    //System.out.println("x - " + x + " : " + "y - " + y);
                    d = text.substring(x, (y + end_line.length() + 1)) + "\n";
                    arrayText.add(d);

                    //System.out.println(d);

                }
            }
            System.out.println("DDDDDDDDDD");
        }
/*        System.out.println(arrayX);
        System.out.println(arrayY);*/
        //System.out.println(d);

        return res;
    }
}



