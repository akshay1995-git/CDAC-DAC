package tester;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import collection.IStack;
import collection.StackImpl;

class StackImplTest {

	@Test
	void testForEmptyInitially() {
		IStack<Integer> stack = new StackImpl<Integer>(3);
		assertTrue(stack.isEmpty());
	}
	@Test
	void testForFullInitially() {
		IStack<Integer> stack = new StackImpl<Integer>(3);
		assertFalse(stack.isFull());
	}
	
	@Test
	void testPushUntilFull() {
		IStack<Integer> stack = new StackImpl<Integer>(1);
		stack.push(1);
		assertTrue(stack.isFull());
	}

	@Test
	void testPopAndValidateValue() {
		IStack<Integer> stack = new StackImpl<Integer>(1);
		Integer e= 10;
		stack.push(e);
		assertTrue(stack.pop()==e);
	}
	
}
