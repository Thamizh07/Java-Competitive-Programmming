import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class find_max_element{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node root = null;
        int value;
        while ((value = scanner.nextInt()) != -1) {
            root = insert(root, value);
        }

        int maxElement = findMaxElement(root);
        if (maxElement != Integer.MIN_VALUE) {
            System.out.println("Maximum element is " + maxElement);
        }
        scanner.close();
    }

    static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        }
        else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    static int findMaxElement(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }
}