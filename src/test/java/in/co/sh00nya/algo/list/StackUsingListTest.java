package in.co.sh00nya.algo.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import junit.framework.TestCase;

public class StackUsingListTest extends TestCase {
	
	public void testEmptyStack() {
		StackUsingList<Integer> stack = new StackUsingList<Integer>();
		assertNull(stack.pop());
	}
	
	public void testOnePushSize() {
		StackUsingList<Integer> stack = new StackUsingList<Integer>();
		stack.push(100);
		assertEquals(1, stack.size());
	}
	
	public void testOnePushData() {
		StackUsingList<Integer> stack = new StackUsingList<Integer>();
		stack.push(100);
		assertEquals(100, stack.pop().intValue());
	}
	
	public void testOnePushPop() {
		StackUsingList<Integer> stack = new StackUsingList<Integer>();
		stack.push(100);
		stack.pop();
		assertEquals(0, stack.size());
	}
	
	public void testRandomPushPop() {
		StackUsingList<Integer> stack = new StackUsingList<Integer>();
		List<Integer> data = new ArrayList<Integer>();
		int maxData = 100;
		
		for(int i=1; i<=maxData; i++)
			data.add(i);
		
		Random rand = new Random();
		int push = rand.nextInt(maxData - 1);
		for(int i=0; i<push; i++)
			stack.push(data.get(i));
		
		int pop = rand.nextInt(push - 1);
		for(int i=0; i<pop; i++)
			stack.pop();
		
		int diff = push - pop;
		int diffData = data.get(diff - 1);
		assertEquals(diffData, stack.pop().intValue());
	}

}
