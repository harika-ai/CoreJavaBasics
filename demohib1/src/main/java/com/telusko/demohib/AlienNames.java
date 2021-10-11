package com.telusko.demohib;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Embeddable
//@Entity
//@Table(name = "Alien_Names")
public class AlienNames {

	//@Column(name = "Fname")
	private String Fname;
	//@Column(name = "Mname")
	private String Mname;
	//@Column(name = "Lname")
	private String Lname;

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getMname() {
		return Mname;
	}

	public void setMname(String mname) {
		Mname = mname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	@Override
	public String toString() {
		return "AlienNames [Fname=" + Fname + ", Mname=" + Mname + ", Lname=" + Lname + "]";
	}

}
