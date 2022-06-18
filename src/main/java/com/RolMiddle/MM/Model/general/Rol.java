package com.RolMiddle.MM.Model.general;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.ToString;

@Entity
@ToString
@Table(name = "dbo.rol")
public class Rol implements Serializable{

	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	@Column(name = "startDate")
	private LocalDateTime startDate;
	@Column(name = "nameGame", length = 40)
	private String nameGame;
	@Column(name = "description", length = 40)
	private String description;
	@Column(name = "code", length = 40)
	private Long code;
	@Column(name = "map", length = 40)
	private String map;
	@Column(name = "assignmentID", length = 40)
	private Long assignmentID;
	@JsonIgnoreProperties(value="rol", allowSetters = true)
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name="userId")
	private User rolMaster;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}
	public String getNameGame() {
		return nameGame;
	}
	public void setNameGame(String nameGame) {
		this.nameGame = nameGame;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getMap() {
		return map;
	}
	public void setMap(String map) {
		this.map = map;
	}
	public Long getAssignmentID() {
		return assignmentID;
	}
	public void setAssignmentID(Long assignmentID) {
		this.assignmentID = assignmentID;
	}
	public User getRolMaster() {
		return rolMaster;
	}
	public void setRolMaster(User rolMaster) {
		this.rolMaster = rolMaster;
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
		Rol other = (Rol) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
