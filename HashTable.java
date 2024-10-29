package oopconcepts;

import java.util.*;

class HashTable {

    public static void main(String args[]) {

        HashMap<String, String> courseTeacher = new HashMap<>();

        courseTeacher.put("History", "Ben");
        courseTeacher.put("Mathematics", "Jeanette");
        courseTeacher.put("Physics", "Lily");

        System.out.println("Courses offered at our Institute:");

        for (String i : courseTeacher.keySet()) {
            System.out.println(i);
        }

        System.out.println("\nTeachers teaching at our Institute:");

        for (String i : courseTeacher.values()) {
            System.out.println(i);
        }

    }
}
