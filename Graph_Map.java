package oopconcepts;

import java.util.*;

public class Graph_Map<T> {

    Map<T, List<T>> graph = new HashMap<>();

    public void addVertex(T s) {
        graph.put(s, new LinkedList<>());
    }

    public void addEdge(T source, T destination, boolean bidirectional) {

        if (!graph.containsKey(source)) {
            addVertex(source);
        }

        if (!graph.containsKey(destination)) {
            addVertex(destination);
        }
        
        graph.get(source).add(destination);
        if (bidirectional == true) {
            graph.get(destination).add(source);
        }
    }

    public static void main(String[] args) {
        
        Graph_Map<Integer> g = new Graph_Map<>();

        g.addEdge(0, 1, true);
        g.addEdge(0, 4, true);
        g.addEdge(1, 2, true);
        g.addEdge(1, 3, true);
        g.addEdge(1, 4, true);
        g.addEdge(2, 3, true);
        g.addEdge(3, 4, true);

        // Printing the graph
        System.out.println("Graph:\n" + g.toString());

        // Gives the no of vertices in the graph.
        g.getVertexCount();

        // Gives the no of edges in the graph.
        g.getEdgesCount(true);

        // Tells whether the edge is present or not.
        g.hasEdge(3, 4);

        // Tells whether vertex is present or not
        g.hasVertex(5);
        g.neighbours(1);
        System.out.println("");
    }
    
    public void getVertexCount() {
        System.out.println("The graph has " + graph.keySet().size() + " vertex");
    }

    // This function gives the count of edges
    public void getEdgesCount(boolean bidirection) {
        int count = 0;
        for (T v : graph.keySet()) {
            count += graph.get(v).size();
        }
        if (bidirection == true) {
            count = count / 2;
        }
        System.out.println("The graph has " + count + " edges.");
    }
    
    public void hasVertex(T s) {
        if (graph.containsKey(s)) {
            System.out.println("The graph contains " + s + " as a vertex.");
        }
        else {
            System.out.println("The graph does not contain " + s + " as a vertex.");
        }
    }


    public void hasEdge(T s, T d) {
        if (graph.get(s).contains(d)) {
            System.out.println( "The graph has an edge between " + s + " and " + d + ".");
        }
        else {
            System.out.println( "The graph has no edge between " + s + " and " + d + ".");
        }
    }
    
    public void neighbours(T s) {
        if(!graph.containsKey(s)) 
            return;
        System.out.println("The neighbours of " + s + " are: ");
        for(T w : graph.get(s)) {
            System.out.print(w+",");
        }
    }

        
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for(T v : graph.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : graph.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }
        return (builder.toString());
    }
}
