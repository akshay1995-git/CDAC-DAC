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
		
		int data1=20;
		obj2.AddAtRear(data1);
		int data2=30;
		obj2.AddAtRear(data2);
		int[] listNode=obj2.GetAllElements();//20,30
		assertTrue((listNode.length==2));
	}

}
