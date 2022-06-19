package com.RolMiddle.MM.Model.general;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.RolMiddle.MM.Model.details.AbilityBonus;
import com.RolMiddle.MM.Model.details.Language;
import com.RolMiddle.MM.Model.details.ProficiencyElement;

import lombok.ToString;

@Entity
@ToString
@Table(name = "dbo.races")
public class Races implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Long speed;
	private List<AbilityBonus> abilityBonuses;
	private String age;
	private String alignment;
	private String size;
	private String sizeDescription;
	private List<ProficiencyElement> startingProficiencies;
	private List<Language> languages;
	private String languageDesc;
	private Subraces subraces;

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

	public Long getSpeed() {
		return speed;
	}

	public void setSpeed(Long value) {
		this.speed = value;
	}

	public List<AbilityBonus> getAbilityBonuses() {
		return abilityBonuses;
	}

	public void setAbilityBonuses(List<AbilityBonus> value) {
		this.abilityBonuses = value;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String value) {
		this.age = value;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String value) {
		this.alignment = value;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String value) {
		this.size = value;
	}

	public String getSizeDescription() {
		return sizeDescription;
	}

	public void setSizeDescription(String value) {
		this.sizeDescription = value;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> value) {
		this.languages = value;
	}

	public String getLanguageDesc() {
		return languageDesc;
	}

	public void setLanguageDesc(String value) {
		this.languageDesc = value;
	}

	public List<ProficiencyElement> getTraits() {
		return startingProficiencies;
	}

	public void setTraits(List<ProficiencyElement> value) {
		this.startingProficiencies = value;
	}

	public Subraces getSubraces() {
		return subraces;
	}

	public void setSubraces(Subraces value) {
		this.subraces = value;
	}
}
