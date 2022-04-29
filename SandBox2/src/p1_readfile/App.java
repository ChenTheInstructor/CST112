package p1_readfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
//		File file = new File("names.txt");
//		Scanner scanner = new Scanner(file);
//		while (scanner.hasNextLine()) {
//			String name = scanner.nextLine();
//			int age = scanner.nextInt();
//			scanner.nextLine();
//			System.out.println(name + ": " + age);
//		}

		FileReader fileReader = new FileReader("names.txt");
		BufferedReader br = new BufferedReader(fileReader);
		double totalAge = 0;
		int count = 0;
		String line;
		while ((line = br.readLine()) != null) {
			String name = line;
			String ageStr = br.readLine();
			int age = Integer.parseInt(ageStr);
			totalAge += age;
			count += + 1;
			System.out.println(name + ": " + age);
		}
		System.out.println("The average age is: " + totalAge/count);
	}

}
