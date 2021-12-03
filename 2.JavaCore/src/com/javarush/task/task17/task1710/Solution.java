package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        String[] ar = args;
        if (ar[0].equals("-c")) {
            try {
                if (ar[2].equals("м")) {
                    allPeople.add(Person.createMale(ar[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(ar[3])));
                    System.out.println(allPeople.size()-1);
                }
                if (ar[2].equals("ж")) {
                    allPeople.add(Person.createFemale(ar[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(ar[3])));
                    System.out.println(allPeople.size()-1);
                }

            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else if (ar[0].equals("-i")) {
            int index = Integer.parseInt(ar[1]);
            if (index < allPeople.size() && index >= 0) {
                System.out.println(allPeople.get(index).toString());
            }
        }
        if (ar[0].equals("-u")) {
            Sex sex1 = ar[3].equals("м") ? Sex.MALE : Sex.FEMALE;
            int index = Integer.parseInt(ar[1]);
            if (index < allPeople.size() && index >= 0) {
                try {
                    allPeople.get(index).setName(ar[2]);
                    allPeople.get(index).setSex(sex1);
                    allPeople.get(index).setBirthDate(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(ar[4]));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
        if (ar[0].equals("-d")) {
            int index = Integer.parseInt(ar[1]);
            if (index < allPeople.size() && index >= 0) {
                allPeople.get(index).setName(null);
                allPeople.get(index).setSex(null);
                allPeople.get(index).setBirthDate(null);
            }
        }
    }
}
