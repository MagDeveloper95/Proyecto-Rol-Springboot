package com.RolMiddle.MM.Model.details;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.ToString;
@Entity
@ToString
@Table(name = "dbo.abilityBonus")
public class AbilityBonus implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Language abilityScore;
	private Long bonus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Language getAbilityScore() {
		return abilityScore;
	}

	public void setAbilityScore(Language value) {
		this.abilityScore = value;
	}

	public Long getBonus() {
		return bonus;
	}

	public void setBonus(Long value) {
		this.bonus = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bonus == null) ? 0 : bonus.hashCode());
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
		AbilityBonus other = (AbilityBonus) obj;
		if (bonus == null) {
			if (other.bonus != null)
				return false;
		} else if (!bonus.equals(other.bonus))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
