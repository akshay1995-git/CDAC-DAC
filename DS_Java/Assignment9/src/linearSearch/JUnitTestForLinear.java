package linearSearch;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTestForLinear {

	@Test
	void testForSearching() {
		LinearSearch search=new LinearSearch();
		int ele=5;
		int[] a= {2,5,7,9,4,3};
		//search.searching(ele);
		assertTrue(search.searching(a,ele)!=0);
		assertTrue(search.searching(a, 8)==0);
	}

}
