package com.javarush.task.task18.task1810;

import java.io.*;

/*
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException {
        boolean bl = false;
        while (!bl) {
            try {
                FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
                if (fileInputStream.available() < 1000) {
                    bl = true;
                    fileInputStream.close();
                    throw new DownloadException();
                }
                fileInputStream.close();
            }catch (IOException e){}
        }
    }

    public static class DownloadException extends Exception {
    }
}
