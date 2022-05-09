package p3_methods_test;

import java.util.Scanner;

public class DemoTest1 {

	public static void main(String[] args) {
		printStudents(2, 3);
	}
	
	//A method that will ask and return a test score.
	public static double getScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a test score: ");
		return scanner.nextDouble();
	}
	
	// Use the getScore method to write another method that 
	// asks for n scores and return the average
	
	public static double getAverage(int n) {
		double total = 0;
		for(int i = 0; i < n; i++) {
			total += getScore();
		}
		return total /n;
	}
	
	// Use the printStudent method to print m students' names and averages
	// The average score is based on n scores
	
	public static void printStudents(int n, int m) {
		for(int j = 0; j < m; j++) {
			printStudent(n);
		}
	}
	
	// Use the getName and getAverage methods to print a table 
	// that shows the name and the average of n scores of a student.
	// The name of the method is called printStudent(int n);
	public static void printStudent(int n) {
		System.out.printf("%-10s%10.2f%n", getName(), getAverage(n));
	}
	
	// A method that will ask and return a name
	public static String getName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name: ");
		return scanner.nextLine();
	}

}
