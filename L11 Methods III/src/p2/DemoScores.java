package p2;

import java.util.Scanner;

public class DemoScores {

	public static void main(String[] args) {
		System.out.println("The average test score is: " + getAverage(2));
	}

	public static double getScoreTotal(int n) {
		Scanner scanner = new Scanner(System.in);
		double total = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter test score " + (i + 1) + ": ");
			total += scanner.nextDouble();
		}
		return total;
	}
	
	public static double getAverage(int n) {
		double total = getScoreTotal(n);
		return total / n;
	}

}
