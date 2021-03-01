package Lection15;

import HMLection14.Book;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Andrey Gonzalez");
        names.add("Vitya Alvarez");
        names.add("Marina Kyrykbayeva");
        names.add(1,"Dinara Jackson");
        names.remove(3);
        names.set(2, "Viktor Alvarez");
//        for (int i=0; i<names.size(); i++) {
//            System.out.println(names.get(i));
//        }
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println(names.indexOf("Dinara Jackson"));


    }
}

