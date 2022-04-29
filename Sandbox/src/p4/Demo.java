package p4;

public class Demo {

	public static void main(String[] args) {
//
//		PersonBag bag = new PersonBag(1000);
//		bag.insert(new Person("A"));
//		bag.insert(new Person("B"));
//		bag.insert(new Person("C"));
//		bag.display();
//		System.out.println(PersonBag.getnElems());
//		Backup.backup(bag);
//		PersonBag bag2 = PersonBag.getPersonBag(1000);
//		bag2.display();
//		System.out.println("\nAfter restoration:");
//		PersonBag bag3 = Restore.restorePersonBag();
//		bag3.insert(new Person("D"));
//		bag3.insert(new Person("E"));
//		System.out.println(PersonBag.getnElems()); 
//		bag3.display();
//		
//		System.out.println("Bag 4:");
//		PersonBag bag4 = PersonBag.getPersonBag(1000);
//		bag4.display();
//		
//		Backup.backup(bag);
		PersonBag bag4 = Restore.restorePersonBag();
		System.out.println(bag4.getnElems());
		bag4.insert(new Person("D"));
		bag4.display();
		Backup.backup(bag4);
		
		
//		bag4.insert(new Person("F"));
//		bag4.insert(new Person("G"));
//		bag4.display();
		
		
		
//		if (bag4 != null) {
//			bag4.insert(new Person("F"));
//			bag4.insert(new Person("G"));
//			bag4.display();
//		} else {
//			System.out.println("No restoration needed.");
//		}
	}

}
