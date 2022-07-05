package treeDS;

public class BinaryTree {
	private TreeNode left;
	private TreeNode right;

	public BinaryTree() {
		super();
		left = null;
		right = null;
	}

//Recursive function to perform preorder traversal on the tree
	public static void preorder(TreeNode root) {
		// return if the current node is empty
		if (root == null) {
			return;
		}

		// Display the data part of the root (or current node)
		System.out.print(root.data + " ");

		// Traverse the left subtree
		preorder(root.left);

		// Traverse the right subtree
		preorder(root.right);
	}

	public static void main(String[] args) {
		 TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(3);
	        root.left.left = new TreeNode(4);
	        root.right.left = new TreeNode(5);
	        root.right.right = new TreeNode(6); 
	        root.right.left.right = new TreeNode(8);
	 
	        preorder(root);
	}
}
