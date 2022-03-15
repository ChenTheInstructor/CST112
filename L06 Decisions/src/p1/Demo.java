package p1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Enter a test score: ");
			double score = scanner.nextDouble();

			if (score < 60) {
				System.out.println("F");
			} else if (score < 70) {
				System.out.println("D");
			} else if (score < 80) {
				System.out.println("C");
			} else if (score < 90) {
				System.out.println("B");
			} else {
				System.out.println("A");
			}
		}

		System.out.println("Bye");
	}

}
