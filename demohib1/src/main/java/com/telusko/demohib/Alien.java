package com.telusko.demohib;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "alien_table")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Alien {

	@Id
	private int aId;
	@Column(name = "alien_name")
	private AlienNames aNames;
	// @Transiant//which is used to give nu;l values
	@Column(name = "alien_color")
	private String aColor;
	// @OneToMany(mappedBy = "Alien")
	// private List<Laptop> laptop = new ArrayList<Laptop>();

	@Override
	public String toString() {
		return "Alien [aId=" + aId + ", aNames=" + aNames + ", aColor=" + aColor + "]";
	}

	public AlienNames getaNames() {
		return aNames;
	}

	public void setaNames(AlienNames aNames) {
		this.aNames = aNames;
	}

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getaColor() {
		return aColor;
	}

	public void setaColor(String aColor) {
		this.aColor = aColor;
	}

}
