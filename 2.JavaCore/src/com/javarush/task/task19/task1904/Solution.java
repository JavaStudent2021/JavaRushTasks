package com.javarush.task.task19.task1904;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String line = "";
            String firstName = "";
            String middleName = "";
            String lastName = "";
            Date birthDate = null;
            line = fileScanner.nextLine();
            String[] str = line.split(" ");
            firstName = str[1];
            middleName = str[2];
            lastName = str[0];
            SimpleDateFormat form = new SimpleDateFormat("dd, MM, yyyy", Locale.ENGLISH);
            String f = str[3] + ", " + str[4] + ", " + str[5];
            try {
                birthDate = form.parse(f);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return new Person(firstName, middleName, lastName, birthDate);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
