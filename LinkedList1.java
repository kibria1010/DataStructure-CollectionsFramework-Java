package oopconcepts;

import java.util.*;

public class LinkedList1 {

    public static void main(String args[]) {

        LinkedList<Integer> a = new LinkedList<>();

        a.addFirst(10);
        a.addFirst(20);
        a.addFirst(30);

        Iterator<Integer> itr = a.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
