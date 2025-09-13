package com.advanced.dataStructures.nonLinear.graphs.representation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphList {
    public static void main(String[] args) {
        // n -> nodes
        // m -> edges
        // Adjacency List Representation
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // This line initialises only the outer list
        // The inner lists are vacant
        List<List<Integer>> adjList = new ArrayList<>();
        // Now we create new lists for the individual nodes
        for(int i=0; i<=n; i++){
            adjList.add(new ArrayList<>()); // This is for every node
        }
        // Read the edges from the user & update the list
        for (int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            // Undirected Graph u <--> v
            adjList.get(u).add(v);
            adjList.get(v).add(u); // Skip this line for a directed graph
        }
        // Print the Adjacency List
        for (int i=1; i<=n; i++){
            System.out.print("Node: -> " + i + " : List of Neighbours: ");
            for (int neighbour : adjList.get(i)){
                System.out.print(neighbour + " ");
            }
            System.out.println();
        }
    }
}
