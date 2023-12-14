package heapPackage;

public class Main {
    public static void main(String args[])
	{
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		

		// Function call
		HeapSort ob = new HeapSort();
		ob.sort(arr);

		System.out.println("Sorted array is");
		HeapSort.printArray(arr);
	}
    
}
