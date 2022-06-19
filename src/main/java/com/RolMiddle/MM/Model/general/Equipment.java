package com.RolMiddle.MM.Model.general;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.RolMiddle.MM.Model.details.Cost;
import com.RolMiddle.MM.Model.details.Damage;
import com.RolMiddle.MM.Model.details.EquipmentCategory;
import com.RolMiddle.MM.Model.details.Range;

import lombok.ToString;

@Entity
@ToString
@Table(name = "dbo.equipment")
public class Equipment implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String desc;
	private String special;
	private Long id;
	private String name;
	private EquipmentCategory equipmentCategory;
	private String weaponCategory;
	private String weaponRange;
	private String categoryRange;
	private Cost cost;
	private Damage damage; 
	private Range range;
	private Long weight;
	private List<EquipmentCategory> properties;
	private String contents;

	public String getDesc() {
		return desc;
	}

	public void setDesc(String value) {
		this.desc = value;
	}

	public String getSpecial() {
		return special;
	}

	public void setSpecial(String value) {
		this.special = value;
	}

	public Long getid() {
		return id;
	}

	public void setid(Long value) {
		this.id = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public EquipmentCategory getEquipmentCategory() {
		return equipmentCategory;
	}

	public void setEquipmentCategory(EquipmentCategory value) {
		this.equipmentCategory = value;
	}

	public String getWeaponCategory() {
		return weaponCategory;
	}

	public void setWeaponCategory(String value) {
		this.weaponCategory = value;
	}

	public String getWeaponRange() {
		return weaponRange;
	}

	public void setWeaponRange(String value) {
		this.weaponRange = value;
	}

	public String getCategoryRange() {
		return categoryRange;
	}

	public void setCategoryRange(String value) {
		this.categoryRange = value;
	}

	public Cost getCost() {
		return cost;
	}

	public void setCost(Cost value) {
		this.cost = value;
	}

	public Damage getDamage() {
		return damage;
	}

	public void setDamage(Damage value) {
		this.damage = value;
	}

	public Range getRange() {
		return range;
	}

	public void setRange(Range value) {
		this.range = value;
	}

	public Long getWeight() {
		return weight;
	}

	public void setWeight(Long value) {
		this.weight = value;
	}

	public List<EquipmentCategory> getProperties() {
		return properties;
	}

	public void setProperties(List<EquipmentCategory> value) {
		this.properties = value;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String value) {
		this.contents = value;
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
		Equipment other = (Equipment) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}