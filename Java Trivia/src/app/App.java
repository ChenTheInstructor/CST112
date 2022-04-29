package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		
		Question[] arr = new Question[100];
		int count = 0;
		
		File file = new File("QuestionPool.txt");
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine()) {
			String levelStr = scanner.nextLine();
			System.out.println(levelStr);
			String q= scanner.nextLine();
			String c1 = scanner.nextLine();
			String c2 = scanner.nextLine();
			String c3 = scanner.nextLine();
			String c4 = scanner.nextLine();
			scanner.nextLine();
			int level = Integer.parseInt(levelStr); 
			Question question = new Question(level, q, c1, c2, c3, c4, "A");
			arr[count++] = question;
		}
		
		for(int i = 0 ; i < count; i++) {
			System.out.println(arr[i]);
		}
	}

}
