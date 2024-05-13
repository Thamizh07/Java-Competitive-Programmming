// BST search insert preorder transversal and find the pressence of an element in the tree
import java.util.Scanner;

class Solution<T extends Comparable<T>> 
{
 
    class Node 
    {
        T data;
        Node left, right;
 
        Node(T item) 
        {
            data = item;
            left = right = null;
        }
    }

    Node root;
 
    void preorder(Node root) 
    {
        if (root != null) 
        {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
 
    Node insert(Node node, T key) {
        if (node == null)
            return new Node(key);
 
        if (key.compareTo(node.data) < 0)
            node.left = insert(node.left, key);
        else if (key.compareTo(node.data) > 0)
            node.right = insert(node.right, key);
 
        return node;
    }
 
    boolean search(Node root, T key) {
        if (root == null)
            return false;
 
        if (key.equals(root.data))
            return true;
 
        if (key.compareTo(root.data) < 0)
            return search(root.left, key);
        else
            return search(root.right, key);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dataType = sc.next();
 
        switch (dataType.toLowerCase()) {
            case "int":
                Solution<Integer> intTree = new Solution<>();
                while (true) {
                    int data = sc.nextInt();
                    if (data == 0)
                        break;
                    intTree.root = intTree.insert(intTree.root, data);
                }
                System.out.print("Preorder traversal: ");
                intTree.preorder(intTree.root);
                System.out.println();
                System.out.println("Get the value to search");
                int searchData = sc.nextInt();
                boolean isFound = intTree.search(intTree.root, searchData);
                System.out.println("is search element present: " + isFound);
                break;
            case "double":
                Solution<Double> doubleTree = new Solution<>();
 
                while (true){
                double data = sc.nextDouble();
                  if (data==0)
                    break;
                    doubleTree.root = doubleTree.insert(doubleTree.root, data);
                }
                System.out.print("Preorder traversal: ");
                doubleTree.preorder(doubleTree.root);
                System.out.println();
                System.out.println("Get the value to search");
                double searchDataDouble = sc.nextDouble();
                boolean isFoundDouble = doubleTree.search(doubleTree.root, searchDataDouble);
                System.out.println("is search element present: " + isFoundDouble);
                break;
            case "character":
                Solution<Character> stringTree = new Solution<>();
                
                while (true){
                  char data = sc.next().charAt(0);
                  if(data == '0')
                    break;
                  stringTree.root = stringTree.insert(stringTree.root, data);
                }
                System.out.print("Preorder traversal: ");
                stringTree.preorder(stringTree.root);
                System.out.println();
                System.out.println("Get the value to search");
                char searchString = sc.next().charAt(0);
                boolean isFoundString = stringTree.search(stringTree.root, searchString);
                System.out.println("is search element present: " + isFoundString);
                break;
            default:
                System.out.println("Invalid data type");
                System.exit(1);
        }
    }
}