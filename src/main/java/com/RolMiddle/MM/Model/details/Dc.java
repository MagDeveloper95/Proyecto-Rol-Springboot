package com.RolMiddle.MM.Model.details;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.ToString;

@Entity
@ToString
@Table(name = "dbo.dc")
public class Dc implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long Id;
	private DcType dcType;
	private Long dcValue;
	private String successType;
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public DcType getDcType() {
		return dcType;
	}

	public void setDcType(DcType value) {
		this.dcType = value;
	}

	public Long getDcValue() {
		return dcValue;
	}

	public void setDcValue(Long value) {
		this.dcValue = value;
	}

	public String getSuccessType() {
		return successType;
	}

	public void setSuccessType(String value) {
		this.successType = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
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
		Dc other = (Dc) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
	
}