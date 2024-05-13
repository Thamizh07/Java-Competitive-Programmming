import java.util.Scanner;

public class Kth_Smallest_element{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		while (input >= 0) {

			root = insert(root, input);
			input = sc.nextInt();
		}

		int k = sc.nextInt();
		ans = 0;
		count = 0;
	
      	System.out.println("Enter the kth value:");
		kthSmallest(root, k);
      	
		System.out.println("Smallest kth value " + ans);
		sc.close();
	}

	static int ans, count;

	public static void kthSmallest(Node root, int k) {

		if (root == null)
			return;

		kthSmallest(root.left, k);
		count++;

		if (count == k) {

			ans = root.data;
			return;
		}

		kthSmallest(root.right, k);

	}

	static class Node {

		int data;
		Node left, right;

		Node(int data) {

			this.data = data;
		}
	}

	static Node root = null;

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