package tester;

import static org.junit.Assert.assertTrue;



import org.junit.jupiter.api.Test;


import linkedList.LinkedList;

class JUnitTestCases {

	@Test
	 void testForAddNodeFromFront(){
		LinkedList obj1=new LinkedList();
		int data=10;
		assertTrue(obj1.AddAtFront(data)==data);
		
	}
	@Test
	void testForAddNodeFromRear() {
		LinkedList obj2=new LinkedList();
		int num=21;
		obj2.AddAtFront(num);
		int data=20;
		assertTrue(obj2.AddAtRear(data)==data);
	}

}
