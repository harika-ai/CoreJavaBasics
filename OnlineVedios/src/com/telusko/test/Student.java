package com.telusko.test;

public class Student implements Comparable {
	// comparable is used to sort the student objects it having comapre to method
	private int sRollno;
	private String sName;
	private Double sMarks;

	public Student(int sRollno, String sName, Double sMarks) {
		super();
		this.sRollno = sRollno;
		this.sName = sName;
		this.sMarks = sMarks;
	}

	public int getsRollno() {
		return sRollno;
	}

	public void setsRollno(int sRollno) {
		this.sRollno = sRollno;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Double getsMarks() {
		return sMarks;
	}

	public void setsMarks(Double sMarks) {
		this.sMarks = sMarks;
	}

	@Override
	public String toString() {
		return "Student [sRollno=" + sRollno + ", sName=" + sName + ", sMarks=" + sMarks + "]";
	}

	@Override
	public int compareTo(Object o) {
		return sRollno;
		// its used to comparae the object values
	}

	public int compareTo(Student s) {
		return sMarks > s.sMarks ? 1 : -1;// compare by using student marks
		// return sName.length()>s.sName.length()?1:-1;//comapre by using length of the
		// string

	}

}
