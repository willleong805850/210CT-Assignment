package Basic11;

class BubbleSort {
	void bubble(int arr[]) {
		int l = arr.length;
		// For loop to compare the adjacent items put it in the right order
		for (int i = 0; i < l - 1; i++)
			for (int j = 0; j < l - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	// Prints the array 
	void printArray(int arr[]) {
		int p = arr.length;
		for (int i = 0; i < p; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// Input the array and Sort it 
	public static void main(String args[]) {
		int arry[] = { 9, 1 ,7, 4, 3, 2, 5 ,8, 6};

		BubbleSort bs = new BubbleSort();
		bs.bubble(arry);
		System.out.println("Sorted array");
		bs.printArray(arry);
	}
}
