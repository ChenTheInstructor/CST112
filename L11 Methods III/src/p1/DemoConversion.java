package p1;

import java.util.Scanner;

public class DemoConversion {

	public static void main(String[] args) {
		double celsius = getCelsius();
		System.out.println("The Fahrenheit value is: " + c2f(celsius));
		
		double fahrenheit = getFahrenheit();
		System.out.println("The Celsius value is: " + f2c(fahrenheit));
	}
	
	public static double c2f(double c) {
		return (c * 9 / 5) +32;
	}
	
	public static double f2c(double f) {
		return (f-32) * 0.5556;
	}
	
	public static double getCelsius() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Celsius value: ");
		return scanner.nextDouble();
	}
	
	public static double getFahrenheit() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Fahrenheit value: ");
		return scanner.nextDouble();
	}

}
