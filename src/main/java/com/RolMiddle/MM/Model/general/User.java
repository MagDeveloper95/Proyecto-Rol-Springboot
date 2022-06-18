package com.RolMiddle.MM.Model.general;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.ToString;

@Entity
@ToString
@Table(name = "dbo.user")
public class User implements Serializable{

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;
	@Column(name = "nombre", length = 40)
	private String nombre;
	@Column(name = "email", length = 40)
	private String email;
	@Column(name = "keyLogueo", length = 256)
	private String key;
	@Column(name = "foto", length = 256)
	private String foto;
	@Column(name = "datos", length = 100)
	private String datos;
	@JsonIgnoreProperties(value = {"user"}, allowSetters = true)
	@ManyToOne(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="rolMaster")
	private List<Rol> rol;
	

	
	public User(Long id, String nombre, String email, String key, String foto, String datos,List<Rol> rol) {
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.key = key;
		this.foto = foto;
		this.datos = datos;
		this.rol = rol;
	}

	public User(String nombre, String email, String key, String foto, String datos) {
		this.nombre = nombre;
		this.email = email;
		this.key = key;
		this.foto = foto;
		this.datos = datos;
	}

	public User() {
		this(-1L,"Por defecto","Por defecto","Por defecto","Por defecto","Por defecto", new ArrayList<Rol>());
	}
	
	public Long getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getKey() {
		return key;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public String getDatos() {
		return datos;
	}
	
	public List<Rol> getRol() {
		return rol;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public void setDatos(String datos) {
		this.datos = datos;
	}

	public void setRol(List<Rol> rols) {
		this.rol.clear();
		if(rols!=null) {
			this.rol.addAll(rols);
		}else {
			System.out.println("Error al setear Rols en Usuario");
		}
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
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
}
