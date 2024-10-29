package oopconcepts;

/**
 * A TreeMap is an implementation of the Map interface, where its items are stored as key-value pairs and it is sorted either by natural ordering of its keys or through a Comparator.
 * A TreeMap differs from a HashMap in terms of how their contents are stored. A HashMap stores its keys as hashes in a hash table whereas a TreeMap stores its keys in a binary tree structure, which is a type of tree data structure that has at most two children nodes per parent.
 * While the structure of a TreeMap is more orderly, it comes as a tradeoff with speed in comparison to a HashMap. In Big-O notation, most HashMap operations run in amortized O(1) time; they are generally more time-efficient. Most TreeMap operations run in O(log(n)) time and the TreeMap is generally more space-efficient due to its dynamic allocation of memory per value added.
 * Note: Complexity is a crucial factor when determining what structure to implement. For faster operations over data, aim for a HashMap. For structured and sorted operations on data, it’s best to stick to a TreeMap.
 */

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
