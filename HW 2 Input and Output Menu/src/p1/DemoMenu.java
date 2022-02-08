package p1;

import java.util.Scanner;

public class DemoMenu {
	
	public static void main(String[] args) {
		// input
		String restaurantName = "ABC Restaurant";
		String phone = "(631) 123-4567";
		String line = "------------------------------------------";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first dish: ");
		String dish1 = scanner.nextLine();
		
		System.out.println("Enter second dish: ");
		String dish2 = scanner.nextLine();
		
		System.out.println("Enter third dish: ");
		String dish3 = scanner.nextLine();
		
		System.out.println("Enter first dish price: ");
		double price1 = scanner.nextDouble();
		
		System.out.println("Enter second dish price: ");
		double price2 = scanner.nextDouble();
		
		System.out.println("Enter third dish price: ");
		double price3 = scanner.nextDouble();
		
		scanner.nextLine();
		
		System.out.println("Enter the discount rate: ");
		String rateStr = scanner.nextLine();
		
		System.out.println("Enter the waiter's name: ");
		String waiterName = "Waiter: " + scanner.nextLine();
		
		System.out.println("Enter the table number: ");
		String tableNumber = "Table: " + scanner.nextLine();
		
		// process
		int index = rateStr.indexOf("%");
		String rateNumberPortion = rateStr.substring(0, index);
		double rate = Double.parseDouble(rateNumberPortion);
		double discountedPrice1 = price1*(1-rate/100.0);
		double discountedPrice2 = price2*(1-rate/100.0);
		double discountedPrice3 = price3*(1-rate/100.0);
		
		double originalPriceTotal = price1 + price2 + price3;
		double discountedPriceTotal = discountedPrice1
									+ discountedPrice2
									+ discountedPrice3;
		double priceDifference = originalPriceTotal - discountedPriceTotal;		
		
		
		// output
		String formatHeader = "%-15s%15S%15s%n";
		String formatDishes = "%-10s%20S%15.2f%n";
		String formatDiscountRate = "%-45s%n";
		String formatFootnote = "%-15.2f%15.2f%15.2f%n";
		System.out.println();
		System.out.println(line);
		System.out.printf(formatHeader, "", restaurantName, "");
		System.out.printf(formatHeader, "", phone, "");
		System.out.println();
		System.out.printf(formatHeader, waiterName, "", tableNumber);
		System.out.println(line);
		System.out.printf(formatDishes, "1.", dish1, discountedPrice1);
		System.out.printf(formatDishes, "2.", dish2, discountedPrice2);
		System.out.printf(formatDishes, "3.", dish3, discountedPrice3);
		System.out.println(line);
		System.out.printf(formatDiscountRate, "Discount Rate: " + rateStr);
		System.out.printf(formatFootnote, originalPriceTotal, discountedPriceTotal, priceDifference);
		System.out.println("\n");
		
	}

}
