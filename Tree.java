package oopconcepts;

import java.util.*;

public class Tree {

    public static void main(String[] args) {
        TreeMap<String, String> courseTeacher = new TreeMap<>();

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
