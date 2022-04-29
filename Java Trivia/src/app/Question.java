package app;

public class Question {
	private int level;
	private String q;
	private String c1;
	private String c2;
	private String c3;
	private String c4;
	private String ccs;
	
	public Question(int level, String q, String c1, String c2, String c3, String c4, String ccs) {
		super();
		this.level = level;
		this.q = q;
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
		this.ccs = ccs;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public String getC1() {
		return c1;
	}

	public void setC1(String c1) {
		this.c1 = c1;
	}

	public String getC2() {
		return c2;
	}

	public void setC2(String c2) {
		this.c2 = c2;
	}

	public String getC3() {
		return c3;
	}

	public void setC3(String c3) {
		this.c3 = c3;
	}

	public String getC4() {
		return c4;
	}

	public void setC4(String c4) {
		this.c4 = c4;
	}

	public String getCcs() {
		return ccs;
	}

	public void setCcs(String ccs) {
		this.ccs = ccs;
	}

	@Override
	public String toString() {
		return  "\t" + q 
				+ "\n\t(A) " + c1 
				+ "\n\t(B) " + c2
				+ "\n\t(C) " + c3 
				+ "\n\t(D) " + c4
				+"\n\n\t: ";
	}
	
	

}
