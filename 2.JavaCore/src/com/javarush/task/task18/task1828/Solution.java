package com.javarush.task.task18.task1828;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Прайсы 2
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String nameFine = reader1.readLine();
        BufferedReader reader = new BufferedReader(new FileReader(nameFine));

        Map<String, String> map = writArgs(args);
        String id = map.get("id");
        String productName = map.get("productName");
        String price = map.get("price");
        String quantity = map.get("quantity");
        String line = "";
        String text = "";
        while ((line = reader.readLine()) != null) {
            if (args[0].equals("-u")) {
                String idEdit = line.substring(0, 8);
                if (Integer.parseInt(idEdit.trim()) == Integer.parseInt(id.trim())) {
                    text += addLine(id, 8) + addLine(productName, 30) + addLine(price, 8) + addLine(quantity, 4) + "\n";
                } else {
                    text += line + "\n";
                }

            } else if (args[0].equals("-d")) {
                String idEdit = line.substring(0, 8);
                if (Integer.parseInt(idEdit.trim()) == Integer.parseInt(id.trim())) {
                } else {
                    text += line + "\n";
                }
            }

        }
        System.out.println(text);
        reader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(nameFine));
        bufferedWriter.write(text.trim());
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public static Map<String, String> writArgs(String[] arr) {
        Map<String, String> map = new HashMap<>();
        int lenghtArr = arr.length;
        if (lenghtArr > 2) {
            map.put("id", arr[1]);
            for (int i = 1; i < lenghtArr - 2; i++) {
                String productName = arr[i];
                map.merge("productName", "", (k, n) -> k + (productName + " "));
            }
            String product = addLine(map.get("productName"), 30);
            map.merge("productName", "", (k, n) -> product);
            map.put("price", arr[lenghtArr - 2]);
            map.put("quantity", arr[lenghtArr - 1]);
        } else {
            map.put("id", arr[1]);
        }
        return map;
    }

    public static String addLine(String productName, int lenghtLine) {
        if (productName.length() > lenghtLine) {
            productName = productName.substring(0, lenghtLine);
        } else {
            while (productName.length() < lenghtLine) {
                if (productName.length() <= lenghtLine) {
                    productName += " ";
                }
            }
        }
        return productName;
    }
}
