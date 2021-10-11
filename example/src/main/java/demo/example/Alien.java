package demo.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="ALIEN_TABLE")
public class Alien {

	@Id
	private int aId;
	//@Transient
	@Column(name="ALIEN_NAME")
	private String aName;
	@Column(name="ALIEN_COLOR")
	private String aColor;

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public String getaColor() {
		return aColor;
	}

	public void setaColor(String aColor) {
		this.aColor = aColor;
	}

}
