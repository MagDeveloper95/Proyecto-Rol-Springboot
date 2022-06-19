package com.RolMiddle.MM.Model.details;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.ToString;

@Entity
@ToString
@Table(name = "dbo.language")
public class Language implements Serializable {

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
}