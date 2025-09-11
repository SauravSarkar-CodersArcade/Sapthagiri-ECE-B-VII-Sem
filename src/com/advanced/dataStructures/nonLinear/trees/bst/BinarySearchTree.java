package com.advanced.dataStructures.nonLinear.trees.bst;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class BinarySearchTree {
    static void inOrderTraversal(TreeNode root){
        if(root != null){
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }
    static TreeNode insert(TreeNode root, int key){
        if (root == null){
            return new TreeNode(key); // Make a new node & return
        }
        if(key < root.data){
            root.left = insert(root.left, key);
        }else if(key > root.data){
            root.right = insert(root.right, key);
        }
        return root;
    }
    static TreeNode search(TreeNode root, int key){
        if(root == null || root.data == key){
            return root;
        }
        if(root.data < key){
            return search(root.right, key);
        }
        return search(root.left, key);
    }
    static TreeNode findMin(TreeNode root){
        TreeNode temp = root;
        while (temp != null && temp.left != null){
            temp = temp.left;
        }
        return temp; // This will be the least value of that subtree
    }
    static TreeNode deleteNode(TreeNode root, int key){
        if(root == null){
            return root;
        }
        if(key < root.data){
            root.left = deleteNode(root.left, key);
        }else if(key > root.data){
            root.right = deleteNode(root.right, key);
        }else {
          // Only 1 child
          if(root.left == null) { // left child doesn't exist
            TreeNode temp = root.right;
            root = null;
            return temp;
          }else if(root.right == null){ // right child doesn't exist
              TreeNode temp = root.left;
              root = null;
              return temp;
          }
            // Node with 2 children
            // We find the inorder successor of the node, which is the
            // least value of the right subtree
            // We replace the node with the inorder successor
            // Then we delete the duplicate value on the right side
            // By calling the - delete() from the node.right
            TreeNode temp = findMin(root.right);
            root.data = temp.data;
            root.right = deleteNode(root.right, temp.data);
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = null;
        root = insert(root, 50);
        System.out.println("InOrder Traversal: ");
        inOrderTraversal(root);
        insert(root, 20);
        insert(root,60);
        insert(root,30);
        insert(root,89);
        insert(root,10);
        System.out.println("\nInOrder Traversal: ");
        inOrderTraversal(root);
        TreeNode result1 = search(root, 89);
        System.out.println();
        if(result1 == null){
            System.out.println("Key 89 not found in the BST.");
        }else {
            System.out.println("Key 89 found in the BST.");
        }
        TreeNode result2 = search(root, 890);
        System.out.println();
        if(result2 == null){
            System.out.println("Key 890 not found in the BST.");
        }else {
            System.out.println("Key 890 found in the BST.");
        }
        root = deleteNode(root, 50);
        System.out.println("InOrder Traversal: ");
        inOrderTraversal(root);
        System.out.println("\nNew Root: " + root.data);
    }
}
