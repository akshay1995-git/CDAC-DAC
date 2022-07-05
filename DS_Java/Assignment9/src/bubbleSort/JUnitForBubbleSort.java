package bubbleSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitForBubbleSort {

	@Test
	void testForBubbleSort() {
		BubbleSort obj=new BubbleSort();
		int []a= {3,2,5,6,4};
		int b[]=obj.bubbuleSort(a);
		assertTrue((b[0]==2)&&(b[b.length-1]==6));
	}

}
