package p2_math;

import java.util.Scanner;

public class DemoMath {

	public static void main(String[] args) {
		// +, -, *, /
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two whole numbers: ");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
		System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2 * 1.0));
		System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));
		System.out.println(n1 + " ^ " + n2 + " = " + Math.pow(n1, n2));
		System.out.println(n1 + " sqrt  = " + Math.sqrt(n1));
	}

}
