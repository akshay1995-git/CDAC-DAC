package binaryTree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryTreeTest {
	@Test
	void testPreOrder() {
		BinaryTree bt = new BinaryTree();
		int[] element = bt.BuildTreeForPreOrder();
		int[] traversalResult = bt.PreOrder();

		assertArrayEquals(element, traversalResult);
	}

}
