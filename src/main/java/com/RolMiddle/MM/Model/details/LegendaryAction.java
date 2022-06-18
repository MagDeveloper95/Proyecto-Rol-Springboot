package com.RolMiddle.MM.Model.details;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.ToString;

@Entity
@ToString
@Table(name = "dbo.legendaryAction")
public class LegendaryAction implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String description;
	private Long attackBonus;
	private List<Damage> damage;

	
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

	public Long getAttackBonus() {
		return attackBonus;
	}

	public void setAttackBonus(Long value) {
		this.attackBonus = value;
	}

	public List<Damage> getDamage() {
		return damage;
	}

	public void setDamage(List<Damage> value) {
		this.damage = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		LegendaryAction other = (LegendaryAction) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}