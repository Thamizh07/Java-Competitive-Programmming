import java.util.Scanner;

public class bst_sum{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
      	int input = sc.nextInt();
      
      	while(input >= 0) {
         
          root = insert(root, input);
          input = sc.nextInt();
        }
      
      	int ans = sum(root);
      	System.out.println("Sum of all nodes are " + ans);
	}

	static class Node {

		int data;
		Node left, right;

		Node(int data) {

			this.data = data;
		}
	}

	static Node root = null;

	static int sum(Node root) {

		if(root == null)
          return 0;
      
      	int leftSubtree = sum(root.left);
      	int rightSubtree = sum(root.right);
      
      	return root.data + leftSubtree + rightSubtree;
	}

	static Node insert(Node root, int data) {

		if (root == null)
			root = new Node(data);

		else if (root.data < data)
			root.right = insert(root.right, data);

		else
			root.left = insert(root.left, data);

		return root;
	}
}