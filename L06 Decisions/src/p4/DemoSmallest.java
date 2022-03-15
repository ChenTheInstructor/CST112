package p4;

import java.util.Scanner;

public class DemoSmallest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		double n1 = scanner.nextDouble();
		double n2 = scanner.nextDouble();
		double n3 = scanner.nextDouble();


		if (n1 <= n2 && n1 <= n3) { // boolean operator "&& = AND"
			System.out.println(n1 + " is smallest");
		}
		
		if (n2 <= n3 && n2 <= n1) {
			System.out.println(n2 + " is smallest");
		}
		
		if (n3 <= n2 && n3 <= n1) {
			System.out.println(n3 + " is smallest");
		}

	}

}
