package p3_random;

public class DemoRandom {

	public static void main(String[] args) {
//		for (int i = 0; i < 20; i++) {
////			System.out.println(100 + (int)(Math.random() * 101));// casting
//		}
		
		for (int i = 0; i < 50; i++) {
			System.out.print((char) (65 + (int) (Math.random() * 26)) + " ");
		}
		System.out.println();
		for (int i = 0; i < 50; i++) {
			System.out.print((char) (97 + (int) (Math.random() * 26)) + " ");
		}
	}

}
