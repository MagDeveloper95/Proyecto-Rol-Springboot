package com.RolMiddle.MM.Model.details;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.ToString;

@Entity
@ToString
@Table(name = "dbo.action")
public class Action implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String description;
	private Options options;
	private Long attackBonus;
	private Dc dc;
	private List<Damage> damage;
	private Usage usage;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public String getdescription() {
		return description;
	}

	public void setdescription(String value) {
		this.description = value;
	}

	public Options getOptions() {
		return options;
	}

	public void setOptions(Options value) {
		this.options = value;
	}

	public Long getAttackBonus() {
		return attackBonus;
	}

	public void setAttackBonus(Long value) {
		this.attackBonus = value;
	}

	public Dc getDc() {
		return dc;
	}

	public void setDc(Dc value) {
		this.dc = value;
	}

	public List<Damage> getDamage() {
		return damage;
	}

	public void setDamage(List<Damage> value) {
		this.damage = value;
	}

	public Usage getUsage() {
		return usage;
	}

	public void setUsage(Usage value) {
		this.usage = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Action other = (Action) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}