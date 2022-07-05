package selectionSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTestForSelection {

	@Test
	void testForSelectionSort() {
		SelectionSort sort=new SelectionSort();
		int arr[]= {3,2,1,4};
		int[] result=sort.selection(arr);
		assertTrue(result[0]==4);
	}

}
