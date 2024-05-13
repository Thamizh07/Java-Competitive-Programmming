class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinaryTreeDeletion{
    Node root;

    public BinaryTreeDeletion() {
        root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

   
    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (root.left == null) {
            root.left = new Node(data);
        } else if (root.right == null) {
            root.right = new Node(data);
        } else {
       
            if (Math.random() < 0.5) {
                root.left = insertRec(root.left, data);
            } else {
                root.right = insertRec(root.right, data);
            }
        }

        return root;
    }
    public void delete(int key) {
    root = deleteRec(root, key);
}

private Node deleteRec(Node root, int key) {
    if (root == null) return root;
    if (key < root.data)
        root.left = deleteRec(root.left, key);
    else if (key > root.data)
        root.right = deleteRec(root.right, key);
    else {
        if (root.left == null)
            return root.right;
        else if (root.right == null)
            return root.left;
        root.data = minValue(root.right);
        root.right = deleteRec(root.right, root.data);
    }

    return root;
}

private int minValue(Node root) {
    int minValue = root.data;
    while (root.left != null) {
        minValue = root.left.data;
        root = root.left;
    }
    return minValue;
}


   
    public void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTreeDeletion tree = new BinaryTreeDeletion();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        
        tree.delete(80);
        tree.delete(30);

        tree.inorderTraversal(tree.root);
    }
}