package Basic4;

public class TestLinkedList {
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		LinkedList s = new LinkedList();
		System.out.println(s);
		System.out.println();

		/*s.addToTail(new Integer(42));
		System.out.println(s);
		System.out.println();
		s.addToTail(new Character('n'));
		System.out.println(s);
		System.out.println();*/
		/*s.addToTail(new String("hello"));
		System.out.println(s);
		System.out.println();*/
		s.addToTail(new String("I"));
		System.out.println(s);
		System.out.println();
		s.addToTail(new String("am"));
		System.out.println(s);
		System.out.println();
		s.addToTail(new String("Leong"));
		System.out.println(s);
		System.out.println();
		s.addToTail(new String("Ting"));
		System.out.println(s);
		System.out.println();
		s.addToTail(new String("Cheung"));
		System.out.println(s);
		System.out.println();
		while (!s.isEmpty()) {
			System.out.println("removed:" + s.removeFromHead());
			System.out.println(s);
			System.out.println();
		}
		
		
		s.addToHead(new Integer(88));
		System.out.println(s);
		System.out.println();
		s.addToHead(new Character('n'));
		System.out.println(s);
		System.out.println();
		s.addToHead(new String("Have a good day"));
		System.out.println(s);
		System.out.println();
		while (!s.isEmpty()) {
			System.out.println("removed:" + s.removeFromTail());
			System.out.println(s);
			System.out.println();
		}
	}
} // class TestLinkedList