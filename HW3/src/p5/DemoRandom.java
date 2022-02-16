package p5;

public class DemoRandom {

	public static void main(String[] args) {
		String firstName = "";
		firstName = firstName +  (char)((int)(65 + Math.random()*26)) 
					+ (char)(97 + (int)( Math.random() * 26))
					+ (char)(97 + (int)( Math.random() * 26));
		
		String lastName = "";
		lastName = lastName +  (char)((int)(65 + Math.random()*26)) 
				+ (char)(65 + (int)( Math.random() * 26))
				+ (char)(65 + (int)( Math.random() * 26));
		
		System.out.println(firstName + " " + lastName);
	}

}
