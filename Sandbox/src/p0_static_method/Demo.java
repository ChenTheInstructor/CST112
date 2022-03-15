package p0_static_method;

public class Demo {

	public static void main(String[] args) {
		Helper helper1 = new Helper();
		Helper helper2 = new ChildHelper();
		ChildHelper helper3 = new ChildHelper();
		System.out.println(helper1.getString());// hi
		System.out.println(helper2.getString()); // hi
		System.out.println(helper3.getString());
		//this is called method hidding
	}

}
