package com.advanced.dataStructures.nonLinear.graphs.representation;
import java.util.Scanner;
public class GraphMatrix {
    public static void main(String[] args) {
        // n -> number of nodes
        // m -> number of edges
        // Since we traverse all the n nodes -> Time Complexity O(n)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] adjacencyMatrix = new int[n + 1][n + 1]; // This works for 0-based indexing
        // Let's take the input of the edges from the user
        for (int i=0; i<m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            // Undirected Graph u <--> u
            adjacencyMatrix[u][v] = 1;
            adjacencyMatrix[v][u] = 1; // Skip this line if it is a directed graph
        }
        // Let's print the adjacency matrix
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
