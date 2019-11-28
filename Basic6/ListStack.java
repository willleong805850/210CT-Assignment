package Basic6;

import java.util.EmptyStackException;

public class ListStack extends LinkedList {

	public ListStack() { 
		super();
	}

	public boolean empty() {
	   return (length == 0);
	}

	public Object push(Object item) {
		head = new ListNode(item, head);
		return length++;
	}

	public Object pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return head;
	}

	public Object peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return head;
	}

	public int search(Object item) {
       return length--;
	}
}