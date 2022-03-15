package p1;

import java.util.Arrays;
import java.util.function.Predicate;

public class PersonBag implements IdAnalyzable {
	private Person[] arr;
	private int nElems;

	public PersonBag(int maxSize) {
		arr = new Person[maxSize];
	}

	public void insert(Person person) {
		arr[nElems++] = person;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	@Override
	public Person getHighestID() {
		return arr[nElems - 1];
	}

	public Person[] search(Predicate predicate) {
		return null;
	}

	public Person[] search(RankAnalyzable rankAnalyzable) {
		Person[] temp = new Person[nElems];
		int count = 0;
		for (int i = 0; i < nElems; i++) {
			if (arr[i] instanceof Instructor) {
				Instructor instructor = rankAnalyzable.analyzeRank((Instructor) arr[i]);
				if(instructor != null) {
					temp[count++] = instructor;
				}
			}
		}
		return Arrays.copyOf(temp, count);
	}

	public Person[] search(GpaAnalyzable gpaAnalyzable) {
		Person[] temp = new Person[nElems];
		int count = 0;
		for (int i = 0; i < nElems; i++) {
			if (arr[i] instanceof Student) {
				Student s = gpaAnalyzable.analyzeGpa((Student)arr[i]);
				if(s != null) {
					temp[count++] = s;
				}
			}
		}
		return Arrays.copyOf(temp, count);
	}
}
