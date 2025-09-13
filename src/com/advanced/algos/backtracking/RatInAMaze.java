package com.advanced.algos.backtracking;

import java.util.Scanner;

public class RatInAMaze {
    public static boolean isPathSafe(int[][] arr, int x, int y, int n){
        return (x < n && y < n && arr[x][y] == 1);
    }
    public static boolean ratInMaze(int[][] arr, int x, int y,
                                    int n, int[][] resultantArray){
        // Base case -> What if the rat has reached destination?
        if(x == n - 1 && y == n - 1){
            resultantArray[x][y] = 1;
            return true;
        }
        // Check if the current position is safe to stand or not
        if(isPathSafe(arr,x,y,n)){
            // Just update the value of the cell to 1
            resultantArray[x][y] = 1;
            // Move forward to check if there is a path for the rat
            if(ratInMaze(arr,x+1,y,n,resultantArray)){
                return true;
            }
            // Move downward to check if there is a path for the rat
            if(ratInMaze(arr,x,y+1,n,resultantArray)){
                return true;
            }
            // But, if you couldn't find a path, backtrack
            resultantArray[x][y] = 0; // Backtracking
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter the maze array elements:");
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        int[][] resultantArray = new int[n][n];
        for (int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                resultantArray[i][j] = 0;
            }
        }
        if(ratInMaze(arr,0,0,n,resultantArray)){
            // If true, print the path
            for (int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(resultantArray[i][j] + " ");
                }
                System.out.println();
            }
        }else {
            System.out.println("No path for the rat in the maze exists.");
        }
    }
}
