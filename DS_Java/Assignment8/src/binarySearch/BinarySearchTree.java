package binarySearch;

import java.util.Stack;

public class BinarySearchTree implements BinarySearchTreeIntf {
	TreeNode root;

	public BinarySearchTree() {
		super();
		this.root = null;
	}

	@Override
	public void Insert(int element) {
		TreeNode newNode = new TreeNode(element);
		if (root == null) {
			root = newNode;
			System.out.println("Node pushed at Root.." + root.data);
		} else {
			TreeNode temp = root;
			TreeNode node = null;
			while (temp != null) {
				node = temp;
				if (temp.data > element)

					// temp = newNode;
					// System.out.println("Node pushed at left..." + temp.data);
					temp = temp.left;
				// temp=temp.left;
				else if (temp.data < element)

					// temp = newNode;
					// System.out.println("Node pushed at right..." + temp.data);
					temp = temp.right;

				// node = temp;
			}
			if (node == null) {
				temp = newNode;
			} else if (node.data < element) {
				node.right = newNode;
				System.out.println("Node pushed at right :");
			} else {
				node.left = newNode;
				System.out.println("Node pushed at left : ");
			}
		}
	}

	@Override
	public void Delete(int element) {
		// TreeNode newNode = new TreeNode(element);
		TreeNode temp = root;
		TreeNode node = null;
		if (root == null) {
			System.out.println("Tree is empty");
		} else {
			while (temp != null && temp.data != element) {
				node = temp;
				if (temp.data > element) {
					temp = temp.left;
				} else {
					temp = temp.right;
				}
			}
			// Case 1: node to be deleted has no children, i.e., it is a leaf node
			if (temp.left == null && temp.right == null) {

				if (node.left == temp) {
					node.left = null;
					System.out.println("left leaf deleted");
				} else if (node.right == temp) {
					node.right = null;
					System.out.println("right leaf deleted");
				} else {
					root = null;
				}
			}
			// case 2:node to be deleted has one children I.e not leaf node
			else {
				// choose a child node
				TreeNode child = (temp.left != null) ? temp.left : temp.right;

				// if the node to be deleted is not a root node, set its parent
				// to its child
				if (temp != root) {
					if (temp == node.left) {
						node.left = child;
					} else {
						node.right = child;
					}
				}

				// if the node to be deleted is a root node, then set the root to the child
				else {
					root = child;
				}
			}
		}
	}

	@Override
	public boolean Search(int element) {
		TreeNode temp = root;
		if (temp.data == element) {
			// System.out.println("Element found at root node");
			return true;
		} else {
			while (temp != null) {
				if (temp.data > element) {
					if (temp.data == element) {
						// System.out.println("Element Found in Tree");
						return true;
					}
					temp = temp.left;
				} else {
					if (temp.data == element) {
						// System.out.println("Element Found in Tree");
						return true;
					}
					temp = temp.right;
				}

			}
		}
		return false;

	}

	@Override
	public int[] InOrder() {
		int[] listArray = new int[3];
		int i = 0;
		TreeNode node = new TreeNode();
		node = root;
		if (root == null) {
			System.out.println("Tree is Empty...!!!");			
		} else {
			// node=root;
			Stack<TreeNode> list=new Stack<>();
			list.push(node);
			System.out.println(node);
			while(list.isEmpty()!=true) {
			if(node.left != null) {
					list.push(node.left);
					node=node.left;
					System.out.println(node);
				}
			else if(node.right!=null) {
					//list.push(node);
					node=node.right;
					//list.push(node);
					System.out.println(node);
				}
			else {
				node=list.pop();
				System.out.println("pop"+node);
				listArray[i++]=node.data;
			}
			}
		
		}
		return listArray;

	}

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		//insertion in binary tree set
		bst.Insert(2);
		bst.Insert(1);
		bst.Insert(3);
	//	bst.Insert(23);
	//	bst.Insert(4);
	//	bst.Insert(6);
		//search whether element found or not
		//boolean flag = bst.Search(4);
		//System.out.println("Element status : "+flag);//true element found is bst
		//bst.Delete(4);//delete element from bst
		//boolean flag1 = bst.Search(4);//again search deleted element so flag1==false
	//	System.out.println("Element status : "+flag1);//false
		
		bst.InOrder();
		int listTree[] = bst.InOrder();
		for (int i = 0; i < 3; i++) {
			System.out.println(listTree[i]);
		}
	}

	
}
