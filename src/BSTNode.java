import java.util.*;
class BSTNode {
    int data;
    BSTNode left, right;
    public BSTNode(int item) {
        data = item;
        left = right = null;
    }
}
class BinarySearchTree {
    BSTNode root;
    public BinarySearchTree() {
        root = null;
    }
    void insert(int data) {
        root = insertNode(root, data);
    }
    BSTNode insertNode(BSTNode root, int data) {
        if (root == null) {
            root = new BSTNode(data);
            return root;
        }
        if (data < root.data)
            root.left = insertNode(root.left, data);
        else if (data > root.data)
            root.right = insertNode(root.right, data);
        return root;
    }
    boolean search(int data) {
        return searchRec(root, data);
    }
    boolean searchRec(BSTNode root, int data) {
        if (root == null)
            return false;
        if (root.data == data)
            return true;
        if (data > root.data)
            return searchRec(root.right, data);
        return searchRec(root.left, data);
    }
    void inorder() {
        inorderRec(root);
    }
    void inorderRec(BSTNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
}
class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        System.out.println("Inorder traversal of the BST:");
        bst.inorder();
        System.out.println();
        System.out.println("\nSearch results:");
        System.out.println("20 exists: " + bst.search(20));
        System.out.println("30 exists: " + bst.search(30));
        System.out.println("50 exists: " + bst.search(50));
        System.out.println("60 exists: " + bst.search(60));
        System.out.println("70 exists: " + bst.search(70));
        System.out.println("80 exists: " + bst.search(80));
    }
}
