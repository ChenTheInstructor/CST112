package p4;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Backup {
	
	public static void backup(PersonBag personBag) {
//		PersonBag theBag = PersonBag.getPersonBag(1000);
		
		try {
			FileOutputStream dos = new FileOutputStream("backupData/personBag.dat");
			ObjectOutputStream oos = new ObjectOutputStream(dos);
			oos.writeObject(personBag);
			oos.write(personBag.getnElems());
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
