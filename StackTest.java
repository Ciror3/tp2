package stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.jupiter.api.Test;

public class StackTest {
 
	@Test
	public void test01MasterStackShouldBeEmptyWhenCreated() {
		assertTrue(new MasterStack().isEmpty());
	}
  
	@Test
	public void test02PushAddElementsToTheMasterStack() {
		assertFalse(new MasterStack().push("Something").isEmpty());
	} 

	@Test
	public void test03PopRemovesElementsFromTheMasterStack() {
		MasterStack MasterStack = new MasterStack();
		MasterStack.push("Something");
		MasterStack.pop();
		assertTrue(MasterStack.isEmpty());
	}

	@Test
	public void test04PopReturnsLastPushedObject() {
		MasterStack MasterStack = new MasterStack();
		String pushedObject = "Something";
		MasterStack.push(pushedObject);
		assertEquals(MasterStack.pop(), pushedObject);
	}

	@Test
	public void test05MasterStackBehavesLIFO() {
		MasterStack MasterStack = new MasterStack();
		String firstPushedObject = "First";
		String secondPushedObject = "Second";

		MasterStack.push(firstPushedObject);
		MasterStack.push(secondPushedObject);

		assertEquals(MasterStack.pop(), secondPushedObject);
		assertEquals(MasterStack.pop(), firstPushedObject);
		assertTrue(MasterStack.isEmpty());
	}

	@Test
	public void test06TopReturnsLastPushedObject() {
		String pushedObject = "Something";
		assertEquals(new MasterStack().push(pushedObject).top(), pushedObject);
	}

	@Test
	public void test07TopDoesNotRemoveObjectFromMasterStack() {
		MasterStack MasterStack = new MasterStack();
		MasterStack.push("Something");
		assertEquals(MasterStack.size(), 1);
		MasterStack.top();
		assertEquals(MasterStack.size(), 1);
	}

	@Test
	public void test08CanNotPopWhenThereAreNoObjectsInTheMasterStack() {
		MasterStack MasterStack = new MasterStack();
		try {
			MasterStack.pop();
			fail("Expected MessageNotUnderstood Error was not thrown.");
		} catch (Error e) {
			assertTrue(e.getMessage().equals(stack.MasterStack.stackEmptyErrorDescription));
		}
	}

	@Test
	public void test09CanNotPopWhenThereAreNoObjectsInTheMasterStackAndTheMasterStackHadObjects() {
		MasterStack MasterStack = new MasterStack();
		MasterStack.push("Something");
		MasterStack.pop();
		try {
			MasterStack.pop();
			fail("Expected MessageNotUnderstood Error was not thrown.");
		} catch (Error e) {
			assertTrue(e.getMessage().equals(stack.MasterStack.stackEmptyErrorDescription));
		}
	}

	@Test
	public void test10CanNotTopWhenThereAreNoObjectsInTheMasterStack() {
		MasterStack MasterStack = new MasterStack();
		try {
			MasterStack.top();
			fail("Expected MessageNotUnderstood Error was not thrown.");
		} catch (Error e) {
			assertTrue(e.getMessage().equals(stack.MasterStack.stackEmptyErrorDescription));
		}
	}
}