package Basic1;

import java.util.Scanner;

public class Basic1 {

	public static void main(String[] args) {

		// initialize the Scanner object inp
		Scanner inp = new Scanner(System.in);
		// initialized those 3 integers to validate is it a Armstrong number
		int i = 0, a, temp;
		// Ask user to input the value
		System.out.print("Please enter a Integer to verify is it a Armstrong number :");
		// execute the method that just created
		int n = inp.nextInt();
		temp = n;
		String inputtostring = String.valueOf(n);
		// close the Scanner
		inp.close();

		// To check is it a 3 digit Armstrong number or not
		if (inputtostring.length() == 3) {
			while (n > 0) {
				a = n % 10;
				n = n / 10;
				i = i + (a * a * a);
			}
			if (temp == i)
				System.out.println("Yes, it is an Armstrong number"); // Output when it is a 3 digit number and an
																		// Armstrong Number
			else
				System.out.println("No, it is not an Armstrong number");// Output when it is a 3 digit number and not an
																		// Armstrong Number
		} else {
			System.out.print(" please enter a 3 digit number!!!!!! ");// Output when input is not a 3 digit number
		}
	}
}
