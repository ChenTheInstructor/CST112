package p2;

import java.util.Scanner;

public class DemoTable {

	public static void main(String[] args) {
		// input
		String line = "---------------------------------------------";
		String format = "%-10d%-10s%-10d%-10s%-10.1f%n";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two whole numbers: ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		System.out.printf("%-10s%-10s%-10s%-10s%-10s%n", "x", "Operator", "y", "=", "Result");
		System.out.println(line);
		System.out.printf(format,x, "+", y, "=", (1.0* x + y));
		System.out.printf(format,x, "-", y, "=", (1.0* x - y));
		System.out.printf(format,x, "x", y, "=", (1.0* x * y));
		System.out.printf(format,x, "/", y, "=", (1.0* x / y));
		System.out.printf(format,x, "%", y, "=", (x % y)*1.0);
	}

}
