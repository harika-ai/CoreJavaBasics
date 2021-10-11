package com.telusko.demohib;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class Student {
	/*
	 * public Laptop getLaptop() { return laptop; }
	 * 
	 * public void setLaptop(Laptop laptop) { this.laptop = laptop; }
	 */

	@Id
	private int sId;
	@Column(name = "SNAME")
	private String sName;
	@Column(name = "SMARKS")
	private String sMarks;
	/*
	 * @OneToOne private Laptop laptop;
	 */
	// without mappedBy created three tables
	// laptop-student,student-laptop,laptop,student
	// @OneToMany(mappedBy="student")
	// without mapped by created four tables
	// laptop-student,student-laptop,laptop,student
	@ManyToMany(mappedBy = "student")
	private List<Laptop> laptop = new ArrayList<Laptop>();

	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsMarks() {
		return sMarks;
	}

	public void setsMarks(String sMarks) {
		this.sMarks = sMarks;
	}
}
