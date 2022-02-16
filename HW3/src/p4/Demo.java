package p4;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		String line = "------------------------------";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a whole number: ");
		int x = scanner.nextInt();
		int result1 = (x*x + x + 1);
		
		int y = x * x;
		int result2 = y*y + y + 1;
		
		int z = x * x * x;
		int result3 = z*z + z + 1;
		
		
		System.out.printf("%-10s%-20s%n", "x", "x^2+x+1");
		System.out.println(line);
		
		System.out.printf("%-10d%-20d%n", x, result1);
		System.out.printf("%-10d%-20d%n", y, result2);
		System.out.printf("%-10d%-20d%n", z, result3);
		
	}

}
