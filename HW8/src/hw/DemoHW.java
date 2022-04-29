package hw;

import java.util.Arrays;
import java.util.Random;

public class DemoHW {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 2, 9, 8 };
		System.out.println(Arrays.toString(getEvenValues(arr)));
	}

	public static int[] getEvenValues(int[] numbers) {
		int[] newArr = new int[numbers.length];
		int index = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				newArr[index++] = numbers[i];
			}
		}
		int[] a = Arrays.copyOf(newArr, index);
		return a;
	}

	public static int getMaxLocation(String[] arr) {
		int indexLargest = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].compareTo(arr[indexLargest]) > 0) {
				indexLargest = i;
			}
		}
		return indexLargest;
	}

	public static int getMinLocation(int[] numbers) {
		int indexSmallest = 0;
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < numbers[indexSmallest]) {
				indexSmallest = i;
			}
		}
		return indexSmallest;
	}

	public static int getMaxLocation(int[] numbers) {
		int indexLargest = 0;
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > numbers[indexLargest]) {
				indexLargest = i;
			}
		}
		return indexLargest;
	}

	public static int[] reverseArray(int[] numbers) {
		int[] newArr = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
//			newArr[numbers.length - (1 + i)] = numbers[i];
			newArr[i] = numbers[numbers.length - (1 + i)];
		}
		return newArr;
	}

	public static String minimum(String[] names) {
		String smallest = names[0];
		for (int i = 1; i < names.length; i++) {
			if (names[i].compareTo(smallest) < 0) {
				smallest = names[i];
			}
		}
		return smallest;
	}

	public static String maximum(String[] names) {
		String largest = names[0];
		for (int i = 1; i < names.length; i++) {
			if (names[i].compareTo(largest) > 0) {
				largest = names[i];
			}
		}
		return largest;
	}

	public static double getAverage(int[] a) {
		double total = 0.0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		return total / a.length;
	}

	public static int minimum(int[] numbers) {
		int smallest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		return smallest;
	}

	public static int maximum(int[] numbers) {
		int largest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		return largest;
	}

	public static String[] fillStringArray(int size, int n) {
		String[] newArr = new String[size];
		for (int i = 0; i < size; i++) {
			newArr[i] = getString(n);
		}
		return newArr;
	}

	public static String getString(int n) {
		String newStr = "";
		for (int i = 0; i < n; i++) {
			newStr += (char) ((int) (65 + Math.random() * 26));
		}
		String formattedStr = newStr.charAt(0) + newStr.substring(1).toLowerCase();
		return formattedStr;
	}

	public static int[] doubleNumberArray(int[] numbers) {
		int[] newArr = new int[numbers.length];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = numbers[i] * 2;
		}
		return newArr;
	}

	public static void fillNumberArray(int[] numbers) {
		Random rand = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(51);
		}
	}

	public static double[] getDoubleArray(int size) {
		return new double[size];
	}

	public static String[] getStringArray(int size) {
		return new String[size];
	}

	public static int[] getNumberArray(int size) {
		return new int[size];
	}

	public static void displayNumbers(int[] numbers) {
		for (int n : numbers) { // enhanced for-loop
			System.out.print(n + " ");
		}
		System.out.println();
	}

	public static void displayStrings(String[] names) {
		for (String str : names) {
			System.out.print(str + " ");
		}
		System.out.println();
	}

}
