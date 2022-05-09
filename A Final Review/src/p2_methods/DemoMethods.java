package p2_methods;

import java.util.Arrays;
import java.util.Scanner;

public class DemoMethods {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		getAndPrint(2);
	}
	
	public static void getAndPrint(int repeats) {
		for (int i = 0; i < 2; i++) {
			String name = getName();
			double gpa = getGpa();
			double curve = getCurvedAmount();
			scanner.nextLine();
			printTable(name, gpa, curve);
		}
	}
	
	public static String getName() {
//		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		return scanner.nextLine();
	}
	
	public static double getGpa() {
//		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your GPA: ");
		return scanner.nextDouble();
	}
	
	public static double getCurvedAmount() {
//		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the amount to curve: ");
		return scanner.nextDouble();
	}

	public static double[] getGPAAndCurvedGPA(double gpa, double curvedAmount) {
//		double[] arr = { gpa, (gpa + curvedAmount) };
//		return arr;
		double[] arr = new double[2];
		arr[0] = gpa;
		arr[1] = gpa + curvedAmount;
		return arr;
	}

	public static void printTable(String name, double gpa, double curvedAmount) {
		System.out.printf("%-10s%10.2f%10.2f%n", name, gpa, (gpa + curvedAmount));
	}

	public static double getCurvedGPA(double gpa, double curvedAmount) {
		return gpa + curvedAmount;
	}

	public static void showMessage() {
		System.out.println("John" + ": " + 3.5);
	}

	public static void showMessage(String name, double gpa) {
		System.out.println(name + ": " + gpa);
	}

	public static double getCurvedGPA(double gpa) {
		return gpa + 0.5;
	}

}
