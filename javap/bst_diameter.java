import java.util.Scanner;
class bst_diameter{
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
      	
        if(leftSubtree < rightSubtree){
        return rightSubtree+1 ;
        }
        else{
          return leftSubtree+1;}
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
  	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	int input = sc.nextInt();
      	while(input >= 0) {
          root = insert(root, input);
          input = sc.nextInt();
        }
      	int ans = sum(root);
      	System.out.println("Diameter of the given binary tree is " + ans);
	}
}