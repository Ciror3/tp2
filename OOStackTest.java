package stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class OOStackTest {

	@Test
	public void test01StackShouldBeEmptyWhenCreated() {
		assertTrue(new Stack().isEmpty());
	}

	@Test
	public void test02PushAddElementsToTheStack() {
		assertFalse(new Stack().push("Something").isEmpty());
	}

	@Test
	public void test03PopRemovesElementsFromTheStack() {
		Stack stack = new Stack();
		stack.push("Something");
		stack.pop();
		assertTrue(stack.isEmpty());
	}

	@Test
	public void test04PopReturnsLastPushedObject() {
		Stack stack = new Stack();
		String pushedObject = "Something";
		stack.push(pushedObject);
		assertEquals(stack.pop(), pushedObject);
	}

	@Test
	public void test05StackBehavesLIFO() {
		Stack stack = new Stack();
		String firstPushedObject = "First";
		String secondPushedObject = "Second";

		stack.push(firstPushedObject);
		stack.push(secondPushedObject);

		assertEquals(stack.pop(), secondPushedObject);
		assertEquals(stack.pop(), firstPushedObject);
		assertTrue(stack.isEmpty());
	}

	@Test
	public void test06TopReturnsLastPushedObject() {
		String pushedObject = "Something";
		assertEquals(new Stack().push(pushedObject).top(), pushedObject);
	}

	@Test
	public void test07TopDoesNotRemoveObjectFromStack() {
		Stack stack = new Stack();
		stack.push("Something");
		assertEquals(stack.size(), 1);
		stack.top();
		assertEquals(stack.size(), 1);
	}

	@Test
	public void test08CanNotPopWhenThereAreNoObjectsInTheStack() {
		Stack stack = new Stack();
		try {
			stack.pop();
			fail("Expected MessageNotUnderstood Error was not thrown.");
		} catch (Error e) {
			assertTrue(e.getMessage().equals(Stack.stackEmptyErrorDescription));
		}
	}

	@Test
	public void test09CanNotPopWhenThereAreNoObjectsInTheStackAndTheStackHadObjects() {
		Stack stack = new Stack();
		stack.push("Something");
		stack.pop();
		try { 
			stack.pop();
			fail("Expected MessageNotUnderstood Error was not thrown.");
		} catch (Error e) {
			assertTrue(e.getMessage().equals(Stack.stackEmptyErrorDescription));
		}
	}

	@Test
	public void test10CanNotTopWhenThereAreNoObjectsInTheStack() {
		Stack stack = new Stack();
		try { 
			stack.top();
			fail("Expected MessageNotUnderstood Error was not thrown.");
		} catch (Error e) {
			assertTrue(e.getMessage().equals(Stack.stackEmptyErrorDescription));
		}
	}
}