package p4_arrays;

import java.util.Scanner;

public class DemoArrays {

	public static void main(String[] args) {

	}
	
	// use the getNameArr, getScoreArr, getAverage methods to print a table that shows
	// the name, 2 scores, and the average score of 3 students
//	John	95.00 
//	Bill	85.00 
//	Julie	90.00
	
	public static void showStudents() {
		String[] namesArr = getNameArr(3);
		double[] scores = getScoreArr(2);
		
	}
	
	public static String getName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name: ");
		return scanner.nextLine();
	}
	
	// Write a method that will return n names in an array
	public static String[] getNameArr(int n) {
		String[] arr = new String[n];
		for(int i = 0; i < n; i++) {
			arr[i] = getName();
		}
		return arr;
	}
	
	// Write a method that will return m test scores in an array
	public static double[] getScoreArr(int m) {
		double[] arr = new double[m];
		for(int i = 0; i < m; i++) {
			arr[i] = getScore();
		}
		return arr;
	}
	
	// Write a method that will return the average of an array of test scores
	public static double getAverage(double[] a) {
		double total = 0;
		for(int i = 0; i < a.length; i++) {
			total += a[i];
		}
		return total / a.length;
	}
	
	public static double getScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a test score: ");
		return scanner.nextDouble();
	}

}
