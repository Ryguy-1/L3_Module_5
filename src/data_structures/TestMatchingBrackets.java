package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}
	Stack<Character> stack = new Stack <Character>();
	String check = "";
	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		for (int i = 0; i < b.length(); i++) {
			if(b.charAt(i)=='{') {
				stack.push(b.charAt(i));
				
			}else if(b.charAt(i)=='}'){
				stack.pop();
			}
		}
		if(stack.isEmpty()) {
			
			return true;
			
		}else {
			return false;
		}
		
	}

}