package com.RolMiddle.MM.Model.details;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.ToString;

@Entity
@ToString
@Table(name = "dbo.dcType")
public class DcType implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;

	public Long getIndex() {
		return id;
	}

	public void setIndex(Long value) {
		this.id = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String value) {
		this.name = value;
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
		DcType other = (DcType) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
