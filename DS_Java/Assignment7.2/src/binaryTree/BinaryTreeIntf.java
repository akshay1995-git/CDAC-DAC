package binaryTree;
public interface BinaryTreeIntf {
	public int[] PreOrder();
	public int[] PostOrder();
	public int[] InOrder();

	// Count number of nodes in a binary tree.
	int GetNodesCount();

	// Find height of a binary tree.
	int Height();

	// Count frequency of an element in a binary tree
	int FindFrequency(int element);

	// Count number of leaf nodes in a binary tree
	int CountLeafNodes();

	// Convert tree into mirror image.
	int MakeMirror();
	
	//int[] PostOrder(BinaryTreeNode root);
}
