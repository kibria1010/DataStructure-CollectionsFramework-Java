package oopconcepts;

import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQ {

    static class maxPQ implements Comparator<String> {
        
        @Override
        public int compare(String item1, String item2) {
            return item1.compareTo(item2) < 0 ? 1 : -1;
        }
    }
    
    static class minPQ implements Comparator<String> {
        
        @Override
        public int compare(String item1, String item2) {
            return item1.compareTo(item2) > 0 ? 1 : -1;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<String> max = new PriorityQueue<>(new maxPQ());

        max.add("d");
        max.add("e");
        max.add("f");

        while (max.size() > 0) {
            System.out.print(max.poll() + " ");
        }
        System.out.println("");
        PriorityQueue<String> min = new PriorityQueue<>(new minPQ());

        min.add("d");
        min.add("e");
        min.add("f");

        while (min.size() > 0) {
            System.out.print(min.poll() + " ");
        }
    }
}

/**
 * The Comparable interface is used to define how a class is to be sorted. 
 * It is not to be confused with the Comparator interface, 
 * which is implemented in a separate class. 
 * The Comparable interface is implemented in the class to be sorted.
 */