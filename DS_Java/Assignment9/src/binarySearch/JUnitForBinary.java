package binarySearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitForBinary {

	@Test
	void testForBinarySearch() {
		BinarySearch obj=new BinarySearch();
		int[]a= {2,5,6,7,9};
		int ele=7;
		assertTrue(obj.binarySearch(a,ele)>0);
		int ele1=3;
		assertTrue(obj.binarySearch(a, ele1)<0);
	}

}
