package Basic2;
import java.util.Scanner;

public class Basic2 {
	public static void main(String[] args) {
		//Scanner for the first string
		Scanner inp = new Scanner(System.in);
		//Scanner for the second string
		Scanner inp2 = new Scanner(System.in);
		
		//Ask user to enter first string
		System.out.print("Please enter the first string");
		String string1 = inp.nextLine();
		//Ask user to enter Second string
		System.out.print("Please enter the second string");
		String string2 = inp2.nextLine();
		inp.close();
		inp2.close();
		//To check is string 1 & string 2 null and the first string contain the second string
		if (string1 != null && string2 != null & string2.length() <= string1.length() & string1.contains(string2)) {
			System.out.println("the second string is a substring of the first string "); //output when the first string contains second string
		} else {
			System.out.println("the second string is not a substring of the first string "); //output when the first string does not contains second string
		}
	}
}
