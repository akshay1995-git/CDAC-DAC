package circularDoubly;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTestCases {

	@Test
	void testForInsertNode() {
		DoublyLinkedList obj = new DoublyLinkedList();
		obj.Insert(10);
		obj.Insert(5);
		obj.Insert(30);
		int[] list=obj.GetAllElements();
		assertTrue((list.length==3) && (list[0]==5)&& (list[1]==10)&& (list[2]==30));
		
	}
	@Test
	void testForDeleteNode() {
		DoublyLinkedList obj = new DoublyLinkedList();
		obj.Insert(10);
		obj.Insert(5);
		obj.Insert(30);
		obj.Delete(30);
		int[] list=obj.GetAllElements();
		assertTrue((list.length==2) && (list[0]==5)&& (list[1]==10));
		
	}

}
