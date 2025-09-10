package com.advanced.dataStructures.nonLinear.trees.traversals;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = this.right = null; // The left & right children are not present
    }
    public static void levelOrderOrBFS(TreeNode root){
        // Base case, corner case, edge case
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            TreeNode temp = q.poll();
            System.out.print(temp.data + " ");
            // Left subtree
            if(temp.left != null){
                q.add(temp.left);
            }
            // Right subtree
            if(temp.right != null){
                q.add(temp.right);
            }
        }
    }
    public static void preOrder(TreeNode root){ // DLR
        if(root != null){
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void inOrder(TreeNode root){ // LDR
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public static void postOrder(TreeNode root){ // LRD
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static int findHeight(TreeNode root){
        // Base Case
        if(root == null){
            return 0; // Tree is empty, so height is 0
        }
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);
        int totalHeight = Math.max(leftHeight, rightHeight) + 1;
        return totalHeight;
    }
    public static void main(String[] args) {
        // Construct the tree (Top to Bottom)(level By Level)(left to right)
        // level 0
        TreeNode root = new TreeNode(1);
        // level 1
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        // level 2
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        // level 3
        root.left.right.left = new TreeNode(9);
        root.right.right.left = new TreeNode(15);

        System.out.print("PreOrder: ");
        preOrder(root);
        System.out.println();
        System.out.print("InOrder: ");
        inOrder(root);
        System.out.println();
        System.out.print("PostOrder: ");
        postOrder(root);
        System.out.println();
        System.out.print("BFS or LevelOrderTraversal: " );
        levelOrderOrBFS(root);
        System.out.println("\nHeight of the tree: " + findHeight(root));
    }
}
