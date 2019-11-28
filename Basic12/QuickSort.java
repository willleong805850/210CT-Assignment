package Basic12;

import java.util.Scanner;

class Quick {
	int n;
	int a[];
	Scanner inp = new Scanner(System.in);

	Quick() {
		System.out.print("enter array capacity:");
		n = inp.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("enter the value in the array [" + (i + 1) + "]");
			a[i] = inp.nextInt();
		}
	}

	void display() {
		for (int i = 0; i < n; i++)
			System.out.println(a[i] + " ");
	}

	void quick(int left, int right) {
		if (right - left <= 0)
			return;
		else {
			int piv = a[right];
			int pos = partition(left, right, piv);
			quick(left, pos - 1);
			quick(pos + 1, right);
		}
	}

	int partition(int left, int right, int piv) {
		int l = left - 1;
		int r = right;
		while (true) {
			while (a[++l] < piv)
				;
			while (r > 0 && a[--r] > piv)
				;
			if (l >= r)
				break;
			else
				swap(l, r);
		}
		swap(l, right);
		return l;
	}

	void swap(int l, int r) {
		int temp;
		temp = a[l];
		a[l] = a[r];
		a[r] = temp;
	}
}

class QuickSort {
	public static void main(String args[]) {
		Quick qs = new Quick();
		System.out.println("Unsorted Array");
		qs.display();
		qs.quick(0, qs.n - 1);
		System.out.println("Sorted Array");
		qs.display();
	}
}