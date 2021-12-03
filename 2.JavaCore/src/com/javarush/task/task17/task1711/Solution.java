package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут

        switch (args[0]){
            case "-c":
                synchronized(allPeople){c_crud(listPeopl(args));}
                break;
            case "-u":
                synchronized(allPeople){u_crud(listPeopl(args));}
                break;
            case "-d":
                synchronized(allPeople){d_crud(args);}
                break;
            case "-i":
                synchronized(allPeople){i_crud(args);}
                break;
        }
    }

    private static void i_crud(String[] list) {
        for (int i = 0; i < list.length; i++) {
            if (i == 0) {
            } else {
                int id = Integer.parseInt(list[i]);
                if (allPeople.size() > id && id >= 0)
                    System.out.println(allPeople.get(id));
            }
        }
    }

    private static void d_crud(String[] list) {
        for (int i = 0; i < list.length; i++) {
            if (i == 0) {
            } else {
                int id = Integer.parseInt(list[i]);
                if (allPeople.size() > id && id >= 0) {
                    allPeople.get(id).setName(null);
                    allPeople.get(id).setSex(null);
                    allPeople.get(id).setBirthDate(null);
                }
            }
        }
    }

    private static void u_crud(ArrayList<ListTask> array) {
        System.out.println(allPeople.size());
        Date date = null;

        for (int i = 0; i < array.size(); i++) {
            int id = Integer.parseInt(array.get(i).getId());
            if (allPeople.size() > id && id >= 0) {
                String name = array.get(i).getName();
                Sex sex1 = array.get(i).getSix().equals("м") ? Sex.MALE : Sex.FEMALE;
                try {
                    date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(array.get(i).getAge());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                allPeople.get(id).setName(name);
                allPeople.get(id).setSex(sex1);
                allPeople.get(id).setBirthDate(date);
            }
        }
        allPeople.forEach(a -> System.out.println(a));
        System.out.println(allPeople.size());
    }

    public static void c_crud(ArrayList<ListTask> array) {
        Date date = null;
        for (int i = 0; i < array.size(); i++) {

            String name = array.get(i).getName();
            Sex sex1 = array.get(i).getSix().equals("м") ? Sex.MALE : Sex.FEMALE;
            try {
                date = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(array.get(i).getAge());
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (sex1 == Sex.MALE) {
                allPeople.add(Person.createMale(name, date));
                System.out.println(allPeople.size() - 1);
            } else if (sex1 == Sex.FEMALE) {
                allPeople.add(Person.createFemale(name, date));
                System.out.println(allPeople.size() - 1);
            }
        }
    }

    public static ArrayList listPeopl(String[] args) {

        boolean bl = args[0].equals("-c") ? false:true;
        ArrayList<ListTask> arrayList = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            if (i == 0) {
            } else {
                ListTask listTask = new ListTask();
                if (bl){
                    listTask.setId(args[i]);
                    listTask.setName(args[++i]);
                    listTask.setSix(args[++i]);
                    listTask.setAge(args[++i]);
                    arrayList.add(listTask);
                }else {
                    listTask.setName(args[i]);
                    listTask.setSix(args[++i]);
                    listTask.setAge(args[++i]);
                    arrayList.add(listTask);
                }

            }
        }
        return arrayList;
    }
}

class ListTask {

    private String id;
    private String name;
    private String six;
    private String age;

    public ListTask() {
    }

    public ListTask(String name, String six, String age) {
        this.name = name;
        this.six = six;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSix() {
        return six;
    }

    public void setSix(String six) {
        this.six = six;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ListTask{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", six='" + six + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}