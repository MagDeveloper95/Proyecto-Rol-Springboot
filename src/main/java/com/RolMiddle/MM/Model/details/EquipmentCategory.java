package com.RolMiddle.MM.Model.details;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.ToString;
@Entity
@ToString
@Table(name = "dbo.equipmentCategory")
public class EquipmentCategory implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
    private String name;
    private String url;

    public Long getIndex() { return id; }
    public void setIndex(Long value) { this.id = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }
}
