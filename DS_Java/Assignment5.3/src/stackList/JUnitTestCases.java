package stackList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTestCases {

	@Test
	void testToAddNodeAtTop() {
		//int element=10;
		DoublyListUsingStack obj=new DoublyListUsingStack();
		obj.addNodeAtTop(10);//10<--
		obj.addNodeAtTop(20);//<--20
		int []list=obj.getAllNode();//20,10
		assertTrue((list.length==2) && (list[1]==10));
	}


}
