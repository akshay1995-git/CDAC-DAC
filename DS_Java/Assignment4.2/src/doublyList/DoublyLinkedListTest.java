package doublyList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {
	@Test
	void testEmptyList() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int[] listElements = slist.GetAllElements();
		assertTrue(listElements.length == 0);
	}

	@Test
	void testAddAtFrontOneElement() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element = 5;

		slist.AddAtFront(element);

		int[] listElements = slist.GetAllElements();

		assertTrue((listElements.length == 1) && (listElements[0] == element));
	}
	@Test
	void testAddAtFrontTwoElement() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element1 = 5;
		int element2 = 10;

		slist.AddAtFront(element1); // head -> 5
		slist.AddAtFront(element2); // head -> 10 -> 5

		int[] listElements = slist.GetAllElements(); // 10, 5

		assertTrue((listElements.length == 2) &&
				(listElements[0] == element2) && (listElements[1] == element1));
	}
	@Test
	void testAddAtRearOneElement() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element=77;
		slist.AddAtRear(element);
		int[] listElements = slist.GetAllElements();
		assertTrue((listElements.length == 1) && (listElements[0] == element));
	}
	@Test
	void testAddAtRearTwoElement() {
		DoublyLinkedList slist = new DoublyLinkedList();
		int element1=77;
		slist.AddAtRear(element1);
		int element2=88;
		slist.AddAtRear(element2);
		int[] listElements = slist.GetAllElementsInReverseOrder();
		assertTrue(listElements.length==2 && listElements[0]==element2);
	}
}
