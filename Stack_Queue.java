package oopconcepts;

/**
 * A Deque extends the Queue interface and is a double-ended queue. 
 * It provides methods to add, access, and remove items at the top and end of the deque. 
 * Thereby, it can be used as a queue or stack. 
 * The Deque interface is included in the java.util package.
 * Deque<DataType> myDeque = new DequeClass<DataType>();
 * Where DataType is the data type to be stored in the deque, and 
 * DequeClass is a class implementing the Deque interface, for example, ArrayDeque or LinkedList.
 */

import java.util.*;

public class Stack_Queue {

    public static void main(String[] args) {
        stack();
        queue();
    }
    
    public static void stack() {
        Deque<Integer> s = new ArrayDeque<>();
        s.addFirst(10);
        s.addFirst(20);
        s.addFirst(30);

        while (!s.isEmpty()) {
            System.out.print(s.pollFirst() + " ");
        }
        System.out.println("");
        
        Deque<Integer> s2 = new LinkedList<>();
        s2.addFirst(10);
        s2.addFirst(20);
        s2.addFirst(30);

        while (!s2.isEmpty()) {
            System.out.print(s2.pollFirst() + " ");
        }
        System.out.println("");
    }
    
    public static void queue() {
        Deque<Integer> s = new ArrayDeque<>();
        s.addLast(10);
        s.addLast(20);
        s.addLast(30);

        while (!s.isEmpty()) {
            System.out.print(s.pollFirst() + " ");
        }
        System.out.println("");
        
        Deque<Integer> s2 = new LinkedList<>();
        s2.addLast(10);
        s2.addLast(20);
        s2.addLast(30);

        while (!s2.isEmpty()) {
            System.out.print(s2.pollFirst() + " ");
        }
        System.out.println("");
    }
}
