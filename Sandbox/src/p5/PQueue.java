package p5;
public class PQueue {
	private Student[] queArray;
	private int nElems;
	private int maxSize;

	public PQueue(int maxSize) {
		queArray = new Student[maxSize];
		this.maxSize = maxSize;
		nElems = 0;
	}

	public void insert(Student value) {
		int j;
		if (nElems == 0) {
			queArray[0] = value;
		} else {
			for (j = nElems - 1; j >= 0; j--) {
				if (value.compareTo(queArray[j]) <= 0) {
					queArray[j + 1] = queArray[j];
				} else {
					break;
				}
			}
			queArray[j + 1] = value;

		}
		nElems++;
	}

	public Student remove() {
		return queArray[--nElems];
	}

	public Student peekMin() {
		return queArray[nElems - 1];
	}

	public int size() {
		return nElems;
	}

	public boolean isFull() {
		return nElems == maxSize;
	}

	public boolean isEmpty() {
		return nElems == 0;
	}

}