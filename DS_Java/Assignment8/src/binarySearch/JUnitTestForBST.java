package binarySearch;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTestForBST {
	/*@Test
	void testTraverseEmptyBST() {
		BinarySearchTree bst = new BinarySearchTree();

		int[] expected = new int[0];

		int[] result = bst.InOrder();

		assertArrayEquals(expected, result);
	}*/

@Test
	void testTraverseBSTWithOneElement() {
		BinarySearchTree bst = new BinarySearchTree();

		int[] expected = new int[1];
		expected[0] = 10;

		bst.Insert(expected[0]);

		int[] result = bst.InOrder();

		assertArrayEquals(expected, result);
	}

	@Test
	void testTraverseBST() {
		BinarySearchTree bst = new BinarySearchTree();

		int[] expected = new int[4];
		expected[0] = 1;
		expected[1] = 5;
		expected[2] = 10;
		expected[3] = 15;

		bst.Insert(expected[2]);
		bst.Insert(expected[0]);
		bst.Insert(expected[3]);
		bst.Insert(expected[1]);

		int[] result = bst.InOrder();

		assertArrayEquals(expected, result);
	}

	@Test
	void testFindInEmptyBST() {
		BinarySearchTree bst = new BinarySearchTree();

		assertFalse(bst.Search(10));
	}

	@Test
	void testFindInBSTWithOneElementPresent() {
		BinarySearchTree bst = new BinarySearchTree();

		int[] expected = new int[1];
		expected[0] = 10;

		bst.Insert(expected[0]);

		assertTrue(bst.Search(10));
	}

	@Test
	void testFindInBSTWithOneElementNotFound() {
		BinarySearchTree bst = new BinarySearchTree();

		int[] expected = new int[1];
		expected[0] = 10;

		bst.Insert(expected[0]);

		assertFalse(bst.Search(100));
	}

	@Test
	void testFindInBSTElementPresent() {
		BinarySearchTree bst = new BinarySearchTree();

		int[] expected = new int[4];
		expected[0] = 1;
		expected[1] = 5;
		expected[2] = 10;
		expected[3] = 15;

		bst.Insert(expected[2]);
		bst.Insert(expected[0]);
		bst.Insert(expected[3]);
		bst.Insert(expected[1]);

		assertTrue(bst.Search(10));
	}

	@Test
	void testFindInBSTElementNotFound() {
		BinarySearchTree bst = new BinarySearchTree();

		int[] expected = new int[4];
		expected[0] = 1;
		expected[1] = 5;
		expected[2] = 10;
		expected[3] = 15;

		bst.Insert(expected[2]);
		bst.Insert(expected[0]);
		bst.Insert(expected[3]);
		bst.Insert(expected[1]);

		assertFalse(bst.Search(100));
	}

	@Test
	void testDeleteInEmptyBST() {
		BinarySearchTree bst = new BinarySearchTree();

		int[] expected = new int[0];

		bst.Delete(10);

		int[] result = bst.InOrder();

		assertArrayEquals(expected, result);
	}

	@Test
	void testDeleteInBSTWithOneElementAndElementPresent() {
		BinarySearchTree bst = new BinarySearchTree();

		int[] expected = new int[0];

		bst.Insert(10);
		bst.Delete(10);

		int[] result = bst.InOrder();

		assertArrayEquals(expected, result);
	}

	@Test
	void testDeleteInBSTWithOneElementAndElementNotPresent() {
		BinarySearchTree bst = new BinarySearchTree();

		int[] expected = new int[1];
		expected[0] = 10;

		bst.Insert(expected[0]);
		bst.Delete(100);

		int[] result = bst.InOrder();

		assertArrayEquals(expected, result);
	}

	@Test
	void testDeleteInBSTLeafOfRoot() {
		BinarySearchTree bst = new BinarySearchTree();

		int[] expected = new int[2];
		expected[0] = 1;
		expected[1] = 5;

		bst.Insert(expected[1]);
		bst.Insert(expected[0]);
		bst.Insert(10);

		bst.Delete(10);

		int[] result = bst.InOrder();

		assertArrayEquals(expected, result);
	}

	@Test
	void testDeleteInBSTRootChildWithOneChild() {
		BinarySearchTree bst = new BinarySearchTree();

		int[] expected = new int[3];
		expected[0] = 1;
		expected[1] = 5;
		expected[2] = 10;

		bst.Insert(expected[1]);
		bst.Insert(expected[0]);
		bst.Insert(15);
		bst.Insert(expected[2]);

		bst.Delete(15);

		int[] result = bst.InOrder();

		assertArrayEquals(expected, result);
	}

	@Test
	void testDeleteInBSTRootChildWithTwoChild() {
		BinarySearchTree bst = new BinarySearchTree();

		int[] expected = new int[4];
		expected[0] = 1;
		expected[1] = 5;
		expected[2] = 10;
		expected[3] = 20;

		bst.Insert(expected[1]);
		bst.Insert(expected[0]);
		bst.Insert(15);
		bst.Insert(expected[3]);
		bst.Insert(expected[2]);

		bst.Delete(15);

		int[] result = bst.InOrder();

		assertArrayEquals(expected, result);
	}

	@Test
	void testDeleteInBSTLeafNode() {
		BinarySearchTree bst = new BinarySearchTree();

		int[] expected = new int[4];
		expected[0] = 1;
		expected[1] = 5;
		expected[2] = 10;
		expected[3] = 15;

		bst.Insert(expected[1]);
		bst.Insert(expected[2]);
		bst.Insert(expected[3]);
		bst.Insert(expected[0]);
		bst.Insert(100);

		bst.Delete(100);

		int[] result = bst.InOrder();

		assertArrayEquals(expected, result);
	}

	@Test
	void testDeleteInBSTNodeWithOneChild() {
		BinarySearchTree bst = new BinarySearchTree();

		int[] expected = new int[4];
		expected[0] = 1;
		expected[1] = 5;
		expected[2] = 10;
		expected[3] = 15;

		bst.Insert(expected[1]);
		bst.Insert(expected[0]);
		bst.Insert(100);
		bst.Insert(expected[3]);
		bst.Insert(expected[2]);

		bst.Delete(100);

		int[] result = bst.InOrder();

		assertArrayEquals(expected, result);
	}

	@Test
	void testDeleteInBSTRootNodeWithTwoChild() {
		BinarySearchTree bst = new BinarySearchTree();

		int[] expected = new int[5];
		expected[0] = 1;
		expected[1] = 5;
		expected[2] = 10;
		expected[3] = 30;
		expected[4] = 20;

		bst.Insert(expected[1]);
		bst.Insert(expected[0]);
		bst.Insert(15);
		bst.Insert(expected[3]);
		bst.Insert(expected[2]);
		bst.Insert(expected[4]);

		bst.Delete(15);

		int[] result = bst.InOrder();

		assertArrayEquals(expected, result); 
	}*/
}
