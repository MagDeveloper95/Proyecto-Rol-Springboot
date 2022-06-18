package com.RolMiddle.MM.Model.general;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.RolMiddle.MM.Model.details.Action;
import com.RolMiddle.MM.Model.details.LegendaryAction;
import com.RolMiddle.MM.Model.details.ProficiencyElement;
import com.RolMiddle.MM.Model.details.Senses;
import com.RolMiddle.MM.Model.details.SpecialAbility;
import com.RolMiddle.MM.Model.details.Speed;

import lombok.ToString;

@Entity
@ToString
@Table(name = "dbo.monster")
public class Monster implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String size;
	private String type;
	private String alignment;
	private Long armorClass;
	private Long hitPoints;
	private String hitDice;
	private Speed speed;
	private Long strength;
	private Long dexterity;
	private Long constitution;
	private Long intelligence;
	private Long wisdom;
	private Long charisma;
	private List<ProficiencyElement> proficiencies;
	private List<String> damageVulnerabilities;
	private List<String> damageResistances;
	private List<String> damageImmunities;
	private List<String> conditionImmunities;
	private Senses senses;
	private String languages;
	private Long challengeRating;
	private Long xp;
	private List<SpecialAbility> specialAbilities;
	private List<Action> actions;
	private List<LegendaryAction> legendaryActions;

	public String getid() {
		return id;
	}

	public void setid(String value) {
		this.id = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String value) {
		this.size = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String value) {
		this.type = value;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String value) {
		this.alignment = value;
	}

	public Long getArmorClass() {
		return armorClass;
	}

	public void setArmorClass(Long value) {
		this.armorClass = value;
	}

	public Long getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(Long value) {
		this.hitPoints = value;
	}

	public String getHitDice() {
		return hitDice;
	}

	public void setHitDice(String value) {
		this.hitDice = value;
	}

	public Speed getSpeed() {
		return speed;
	}

	public void setSpeed(Speed value) {
		this.speed = value;
	}

	public Long getStrength() {
		return strength;
	}

	public void setStrength(Long value) {
		this.strength = value;
	}

	public Long getDexterity() {
		return dexterity;
	}

	public void setDexterity(Long value) {
		this.dexterity = value;
	}

	public Long getConstitution() {
		return constitution;
	}

	public void setConstitution(Long value) {
		this.constitution = value;
	}

	public Long getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Long value) {
		this.intelligence = value;
	}

	public Long getWisdom() {
		return wisdom;
	}

	public void setWisdom(Long value) {
		this.wisdom = value;
	}

	public Long getCharisma() {
		return charisma;
	}

	public void setCharisma(Long value) {
		this.charisma = value;
	}

	public List<ProficiencyElement> getProficiencies() {
		return proficiencies;
	}

	public void setProficiencies(List<ProficiencyElement> value) {
		this.proficiencies = value;
	}

	public List<String> getDamageVulnerabilities() {
		return damageVulnerabilities;
	}

	public void setDamageVulnerabilities(List<String> value) {
		this.damageVulnerabilities = value;
	}

	public List<String> getDamageResistances() {
		return damageResistances;
	}

	public void setDamageResistances(List<String> value) {
		this.damageResistances = value;
	}

	public List<String> getDamageImmunities() {
		return damageImmunities;
	}

	public void setDamageImmunities(List<String> value) {
		this.damageImmunities = value;
	}

	public List<String> getConditionImmunities() {
		return conditionImmunities;
	}

	public void setConditionImmunities(List<String> value) {
		this.conditionImmunities = value;
	}

	public Senses getSenses() {
		return senses;
	}

	public void setSenses(Senses value) {
		this.senses = value;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String value) {
		this.languages = value;
	}

	public Long getChallengeRating() {
		return challengeRating;
	}

	public void setChallengeRating(Long value) {
		this.challengeRating = value;
	}

	public Long getXP() {
		return xp;
	}

	public void setXP(Long value) {
		this.xp = value;
	}

	public List<SpecialAbility> getSpecialAbilities() {
		return specialAbilities;
	}

	public void setSpecialAbilities(List<SpecialAbility> value) {
		this.specialAbilities = value;
	}

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> value) {
		this.actions = value;
	}

	public List<LegendaryAction> getLegendaryActions() {
		return legendaryActions;
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
		Monster other = (Monster) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
