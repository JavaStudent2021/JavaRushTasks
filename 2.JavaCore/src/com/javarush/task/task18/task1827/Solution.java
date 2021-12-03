package com.javarush.task.task18.task1827;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Прайсы
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        if (args.length == 0) {

        } else if (args[0].equals("-c")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str = reader.readLine(); //reader.readLine();

            FileReader fileReader = new FileReader(str); // "C:\\DiskD\\jav\\er3.txt"
            FileWriter fileWriter = new FileWriter(str, true); // "C:\\DiskD\\jav\\er3_5.txt"

            String s = "";
            while (fileReader.ready()) {
                int d = fileReader.read();
                s += (char) d;
            }
            fileReader.close();
            int lastId = 0;
            if (args.length > 3) {
                lastId = foundId(s);
                Map<String, String> map = addProduct(args);
                System.out.println(map);
                fileWriter.write('\n');
                fileWriter.write(String.valueOf(lastId + 1));
                fileWriter.write(map.get("productName"));
                fileWriter.write(map.get("price"));
                fileWriter.write(map.get("quantity"));
                fileWriter.flush();
                fileWriter.close();
            }
        }
    }

    private static Map<String, String> addProduct(String[] arr) throws IOException {
        Map<String, String> map = new HashMap<>();
        String productName = "";
        String price = "";
        String quantity = "";

        price = arr[arr.length - 2];
        quantity = arr[arr.length - 1];

        for (int i = 1; i < arr.length - 2; i++) {
            if (i == arr.length - 3) {
                productName += arr[i];
            } else {
                productName += arr[i] + " ";
            }
        }

        map.put("productName", addLine(productName, 30));
        map.put("price", addLine(price, 8));
        map.put("quantity", addLine(quantity, 4));
        return map;
    }

    public static String addLine(String productName, int lenghtLine) {
        while (productName.length() < lenghtLine) {
            if (productName.length() <= lenghtLine) {
                productName += " ";
            }
        }
        return productName;
    }

    public static int foundId(String s) throws IOException {
        String line_s = "";
        int t = 0;
        int maxId = 0;
        for (int i = 0; i < s.length(); i++) {
            String l = String.valueOf(s.charAt(i));
            if (t++ < 8) {
                line_s += l;
            }
            if (s.charAt(i) == '\n' || i == s.length() - 1) {
                int a = Integer.parseInt(line_s.trim());
                maxId = a > maxId ? a : maxId;
                t = 0;
                line_s = "";
            }
        }
        return maxId;
    }
}
