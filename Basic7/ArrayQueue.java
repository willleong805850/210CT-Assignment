package Basic7;

import javax.swing.JOptionPane;

public class ArrayQueue {

	private int maxSize;
	private Object[] entry;
	private int front;
	private int rear;
	private int count;

	public ArrayQueue(int size) {
		maxSize = size;
		entry = new Object[maxSize];
		count = 0;
		front = 0;
		rear = -1;
	}

	public ArrayQueue() {
		this(10);
	}

	public boolean empty() {
		return count <= 0;
	}

	public boolean full() {
		return count == maxSize;
	}
	//getter of the Int, float, String, Char
	public static int getInteger(String prompt) {
		do {
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(null, prompt));
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Invalid integer!");
			}
		} while (true);
	}

	public static float getFloat(String prompt) {
		do {
			try {
				return Float.parseFloat(JOptionPane.showInputDialog(null, prompt));
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Invalid number!");
			}
		} while (true);
	}

	public static String getString(String prompt) {
		return JOptionPane.showInputDialog(null, prompt);
	}

	public static char getChar(String prompt) {
		String s;
		do {
			s = JOptionPane.showInputDialog(null, prompt);
			if (s.length() == 1)
				return s.charAt(0);
		} while (true);
	}
	//Functions of the enqueue and dequeue
	public void enqueue(Object item) throws QueueFullException {
		if (count < maxSize) {
			count++;
			if (rear < maxSize - 1)
				rear++;
			else
				rear = 0;
			entry[rear] = item;
		} else
			throw new QueueFullException();
	}
	
	public Object dequeue() throws EmptyQueueException {
		if (count <= 0)
			throw new EmptyQueueException();
		count--;
		Object temp = entry[front];
		if (front < maxSize - 1)
			front++;
		else
			front = 0;
		return temp;
	}
	//print out the result
	public String toString() {
		String s = "front [ ";

		int index = front;
		for (int i = 0; i < count; i++) {
			s = s + entry[index] + " ";
			if (index < maxSize - 1)
				index++;
			else
				index = 0;
		}

		s = s + "] rear";
		return s;

	}

} // class ArrayQueue

class EmptyQueueException extends RuntimeException {
	public EmptyQueueException() {
		super("Queue is empty");
	}
} // class EmptyQueueException

class QueueFullException extends RuntimeException {
	public QueueFullException() {
		super("Queue is full");
	}
} // class QueueFullException