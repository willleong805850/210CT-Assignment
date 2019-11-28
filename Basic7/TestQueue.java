package Basic7;
import miscLib.GenLib;

public class TestQueue {

    public static void main(String[] args) {
		ArrayQueue q = new ArrayQueue(20);
		byte barray[] = new byte[20];
		int n;
		do {
			n = q.getInteger("How many to enqueue? ");
			for (int i = 0; i < n; i++) {
				q.enqueue(new Integer(GenLib.genInt(1, 100)));
				System.out.println(q);
			}
			n = q.getInteger("How many to dequeue? ");
			for (int i = 0; i < n; i++) {
				if (q.empty()) {
					System.out.println("Queue is now empty, dequeue ignored.");
					break;
				} else {
					System.out.println("dequeued:"+q.dequeue());
					System.out.println(q);
				}
			}
		} while (q.getChar("more (y/n)? ") == 'y');

		System.out.println("Bye now.");
		System.exit(0);
    }

} // class TestQueue