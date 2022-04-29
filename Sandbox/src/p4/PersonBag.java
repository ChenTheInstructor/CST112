package p4;

import java.io.Serializable;

public class PersonBag implements Serializable {
	private Person[] arr;
//	private static PersonBag personBag;
	private int nElems;

	public PersonBag(int maxSize) {
		arr = new Person[maxSize];
		nElems = 0;
	}

	public int getnElems() {
		return nElems;
	}
	
	public void setnElems(int nElems) {
		this.nElems = nElems;
	}

	public Person[] getArr() {
		return arr;
	}

//	public static PersonBag getPersonBag(int maxSize) {
//		if (personBag == null) {
//			personBag = new PersonBag(maxSize);
//		}
//
//		return personBag;
//	}

	public void insert(Person person) {
		arr[nElems++] = person;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();

	}

}
