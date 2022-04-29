package p4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Restore {

	public static PersonBag restorePersonBag() {

		try {
			FileInputStream fis = new FileInputStream("backupData/personBag.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			PersonBag theBag = (PersonBag) (ois.readObject());
			Person.setIdCount(ois.read());
			ois.close();
			return theBag;
		} catch (FileNotFoundException e) {
//				e.printStackTrace();
		} catch (IOException e) {
//			e.printStackTrace();
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
		}
		return null;

	}

}
