package binaryTree;
public class BinaryTree implements BinaryTreeIntf {
	BinaryTreeNode root;

	public BinaryTree() {
		root = null;
	}

	private int[] PostOrderHelper(BinaryTreeNode root) {
		// if root is empty then Stop
		if (root == null) {
			return null;
		}

		// Process root node's data.
		System.out.println(root.data);

		// if root node's left child exists then
		if (root.lChild != null) {
			// PreOrder(root's left child)
			PostOrderHelper(root.lChild);
		}

		// if root node's right child exists then
		if (root.rChild != null) {
			// PreOrder(root's right child)
			PostOrderHelper(root.rChild);
		}

		return null;
	}
	private int[] PreOrderHelper(BinaryTreeNode root) {
		// if root is empty then Stop
		if (root == null) {
			return null;
		}

		// Process root node's data.
		System.out.println(root.data);

		// if root node's left child exists then
		if (root.lChild != null) {
			// PreOrder(root's left child)
			PreOrderHelper(root.lChild);
		}

		// if root node's right child exists then
		if (root.rChild != null) {
			// PreOrder(root's right child)
			PreOrderHelper(root.rChild);
		}

		return null;
	}
	@Override
	public int[] PreOrder() {
		return PreOrderHelper(root);
	}

	public int[] BuildTreeForPreOrder() {
		int[] element = new int[4];
		element[0] = 1;
		element[1] = 2;
		element[2] = 4;
		element[3] = 3;

		root = new BinaryTreeNode(1);
		root.lChild = new BinaryTreeNode(2);
		root.rChild = new BinaryTreeNode(3);
		root.lChild.lChild = new BinaryTreeNode(4);

		return element;
	}


	@Override
	public int[] PostOrder() {
		return PostOrderHelper(root);
		//return null;
	}
	public int[] BuildTreeForPostOrder() {
		int[] element = new int[4];
		element[0] = 1;
		element[1] = 2;
		element[2] = 4;
		element[3] = 3;

		root = new BinaryTreeNode(1);
		root.lChild = new BinaryTreeNode(2);
		root.rChild = new BinaryTreeNode(3);
		root.lChild.lChild = new BinaryTreeNode(4);

		return element;
	}
	@Override
	public int[] InOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int GetNodesCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Height() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int FindFrequency(int element) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int CountLeafNodes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int MakeMirror() {
		// TODO Auto-generated method stub
		return 0;
	}
}
