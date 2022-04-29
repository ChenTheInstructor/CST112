package p2;

public class Demo {

	public static void main(String[] args) {
		// create an int array of size 10
		int[] arr = new int[10];
		
		// fill the entire array with numbers from 10 to 100
		for(int i = 0; i < 10; i++) {
			arr[i] = (i + 1) * 10;
		}
		
		// display the content of the array in one line
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// create a second array of the same type and size named arr2
		int[] arr2 = new int[arr.length];
		
		// copy the content of the first array into the second array
		for(int i = 0; i< arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		// Write a for-loop to display the content of both arrays
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			System.out.println(arr2[i] + ", ");
		}
		
		// Create a third array of the same size and type named arr3
		int[] arr3 = new int[arr.length];
		
		// Add the numbers from the same buckets of arr and arr2 and 
		// put it into the third array in the same bucket
		
		for(int j = 0; j < arr.length; j++) {
			arr3[j] = arr[j] + arr2[j];
		}
		
		// display the content of arr3
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		
	}

}
