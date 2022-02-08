package p1_menu;

import java.util.Scanner;

public class DemoHomework {

	public static void main(String[] args) {
		
		// get input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the restaurant: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter the phone of the restaurant: ");
		String phone = scanner.nextLine();
		
		System.out.println("Enter the first dish: ");
		String dish1 = scanner.nextLine();
		
		System.out.println("Enter the second dish: ");
		String dish2 = scanner.nextLine();
		
		System.out.println("Enter the third dish: ");
		String dish3 = scanner.nextLine();
		
		System.out.println("Enter the first price: ");
		double price1 = scanner.nextDouble();
		
		System.out.println("Enter the second price: ");
		double price2 = scanner.nextDouble();
		
		System.out.println("Enter the third price: ");
		double price3 = scanner.nextDouble();
		
		scanner.nextLine();
		
		System.out.println("Enter waiter name: ");
		String waiterName = "Waiter Name: " + scanner.nextLine();
		
		System.out.println("Enter table number: ");
		String tableNumber = "Table: " + scanner.nextLine();
		
		System.out.println("Enter discount rate: ");
		String discountRate = scanner.nextLine();		
		
		// process
		int index = discountRate.indexOf("%");
		String digits = discountRate.substring(0, index);
		double rate = Double.parseDouble(digits)/100;
		
		price1 = price1 * (1-rate);
		price2 = price2 * (1-rate);
		price3 = price3 * (1-rate);
		
		// display
		String line = "----------------------------------------";
		String format = "%-10s%20S%10.2f%n";
		
		System.out.println("\n");
		System.out.println("\t" + name);
		System.out.println("\t" + phone);
		System.out.println();
		System.out.printf("%-20s%20s%n", waiterName, tableNumber);
		System.out.println(line);
		System.out.printf(format, "1.", dish1, price1);
		System.out.printf(format, "2.", dish2, price2);
		System.out.printf(format, "3.", dish3, price3);
		System.out.println(line);
		System.out.println("\n");
		
	}

}
