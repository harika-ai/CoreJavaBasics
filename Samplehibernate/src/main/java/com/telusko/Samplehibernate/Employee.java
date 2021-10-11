package com.telusko.Samplehibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Table")
public class Employee {
	@Id
	private int eId;
	@Column(name = "employee_name")
	private String eName;
	@Column(name = "employee_color")
	private String eColor;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteColor() {
		return eColor;
	}

	public void seteColor(String eColor) {
		this.eColor = eColor;
	}

}
