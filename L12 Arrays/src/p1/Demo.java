package p1;

public class Demo {

	public static void main(String[] args) {
		// create an int array of size 20
		int[] arr = new int[20];

		// fill the first 10 buckets with numbers from 2 to 11
		for (int i = 0; i < 10; i++) {
			arr[i] = (i + 2);
		}

		// fill the rest of the buckets with numbers from 100, 200, etc, till 1000
		for (int j = 0; j < 10; j++) {
			arr[j + 10] = (j + 1) * 100;
		}
		
		// display the content of the entire array
		for(int j = 0; j < 20; j++) {
			System.out.print(arr[j] + " ");
		}

	}

}
