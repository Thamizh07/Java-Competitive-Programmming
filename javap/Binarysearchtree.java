//binary search tree insercet
import java.util.*;
class Node {
    int data;
    Node left;
    Node right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }

    public boolean search(int data) {
        return searchRec(root, data);
    }

    public boolean searchRec(Node root, int data) {
        if (root == null)
            return false;
        
        if (data == root.data)
            return true;

        if (data < root.data)
            return searchRec(root.left, data);
        else
            return searchRec(root.right, data);
    }

    public void inOrderTraversal() {
        inOrderRec(root);
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }
    public void preOrderTraversal() {
        preOrderRec(root);
    }

    private void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void postOrderTraversal() {
        postOrderRec(root);
    }

    private void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal: ");
        tree.inOrderTraversal();

        System.out.println("\nPreorder traversal: ");
        tree.preOrderTraversal();

        System.out.println("\nPostorder traversal: ");
        tree.postOrderTraversal();

        // int searchData = 60;
        // System.out.println("\nSearching for " + searchData + ": " + tree.search(searchData));

        // searchData = 90;
        // System.out.println("Searching for " + searchData + ": " + tree.search(searchData));
    }
}
// Binary search tree