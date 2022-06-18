package com.RolMiddle.MM.Model.details;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.ToString;
@Entity
@ToString
@Table(name = "dbo.options")
public class Options implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private Long choose;
	private List<From> from;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getChoose() {
		return choose;
	}

	public void setChoose(Long value) {
		this.choose = value;
	}

	public List<From> getFrom() {
		return from;
	}

	public void setFrom(List<From> value) {
		this.from = value;
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
		Options other = (Options) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}