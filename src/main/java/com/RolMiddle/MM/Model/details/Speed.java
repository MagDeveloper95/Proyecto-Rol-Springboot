package com.RolMiddle.MM.Model.details;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.ToString;

@Entity
@ToString
@Table(name = "dbo.speed")
public class Speed implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String walk;
	private String swim;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getWalk() {
		return walk;
	}

	public void setWalk(String value) {
		this.walk = value;
	}

	public String getSwim() {
		return swim;
	}

	public void setSwim(String swim) {
		this.swim = swim;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((swim == null) ? 0 : swim.hashCode());
		result = prime * result + ((walk == null) ? 0 : walk.hashCode());
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
		Speed other = (Speed) obj;
		if (swim == null) {
			if (other.swim != null)
				return false;
		} else if (!swim.equals(other.swim))
			return false;
		if (walk == null) {
			if (other.walk != null)
				return false;
		} else if (!walk.equals(other.walk))
			return false;
		return true;
	}
	

}