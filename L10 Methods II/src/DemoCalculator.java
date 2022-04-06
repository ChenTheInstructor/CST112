import java.util.Scanner;

public class DemoCalculator {

	public static void main(String[] args) {
		double bmi = getBMI(200, 65);
		System.out.println(getBMIStatus(bmi));

	}
	
	public static String getLetterGrade(double score) {
		String letterGrade;
		if(score >= 90) {
			letterGrade = "A";
		} else if(score >= 80) {
			letterGrade = "B";
		} else if (score >= 70) {
			letterGrade = "C";
		} else if(score >= 60) {
			letterGrade = "D";
		} else {
			letterGrade = "F";
		}
		return letterGrade;
	}
	
	public static double getLetterGrade(String letterGrade) {
		double n;
		if(letterGrade.equals("A")) {
			n = 90;
		} else if(letterGrade.equals("B")) {
			n = 80;
		} else if (letterGrade.equals("C")) {
			n = 70;
		} else if(letterGrade.equals("D")) {
			n = 60;
		} else {
			n = 59;
		}
		return n;
	}
	
	public static String getBMIStatus(double bmi) {
		String status;
		if(bmi < 18.5) {
			status = "Under Weight";
		} else if(bmi < 24.9) {
			status = "Healthy Weight";
		} else if (bmi < 29.9) {
			status = "Over Weight";
		} else {
			status = "Obesity";
		}
		return status;
	}
	
	public static double getBMI(double weight, double height) {
		return 703.0 * weight / (height * height);
	}

	public static double add(double n1, double n2) {
		return n1 + n2;
	}

	public static double subtract(double n1, double n2) {
		return n1 - n2;
	}

	public static double multiply(double n1, double n2) {
		return n1 * n2;
	}

	public static double divide(double n1, double n2) {
		if (n2 == 0.0) {
			n2 = getNonZero();
		}
		return n1 / n2;
	}
	
	public static double squareRoot(double n) {
		return Math.sqrt(n);
	}

	private static double getNonZero() {
		Scanner scanner = new Scanner(System.in);
		double n;
		while (true) {
			System.out.println("Enter a non-zero denominator:");
			n = scanner.nextDouble();
			if (n != 0.0) {
				break;
			}
		}
		return n;
	}

	public static double square(double n) {
		return n * n;
	}

}
