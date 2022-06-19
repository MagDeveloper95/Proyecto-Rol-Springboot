package com.RolMiddle.MM.Model.details;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.ToString;

@Entity
@ToString
@Table(name = "dbo.cost")
public class Cost implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Long quantity;
	private String unit;

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long value) {
		this.quantity = value;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String value) {
		this.unit = value;
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
		Cost other = (Cost) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}