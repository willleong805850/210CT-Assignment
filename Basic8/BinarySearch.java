package Basic8;

public class BinarySearch {
	private int globalArray[];
	private int globalKey;
	private static int globalTime;

	public int binSearch(int array[], int key) {
		globalArray = array;
		globalKey = key;
		return (binSearchRecur(0, array.length - 1));
	} // binSearch

	private int binSearchRecur(int low, int high) {
		int middle;

		if (low > high)
			return -1;
		middle = (low + high) / 2;
		globalTime++;

		return globalKey == globalArray[middle] ? middle
				: globalKey < globalArray[middle] ? binSearchRecur(low, middle - 1) : binSearchRecur(middle + 1, high);
	} // binSearchRecur

	public static void main(String args[]) {
		BinarySearch ob = new BinarySearch();
		int[] arr1= {11, 12, 34, 55, 66, 77, 88};
		int result = ob.binSearch(arr1, 88);
		System.out.println(result);
		System.out.println("the number of comparison is " + globalTime);
	}
}
