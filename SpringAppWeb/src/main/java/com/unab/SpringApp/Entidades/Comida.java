package com.unab.SpringApp.Entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "comida")

public class Comida implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long idcomida;
	private String nombre;
	private Double precio;
	private long fk_idcategoria;
	
	public long getIdcomida() {
		return idcomida;
	}
	public void setIdcomida(long idcomida) {
		this.idcomida = idcomida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public long getFk_idcategoria() {
		return fk_idcategoria;
	}
	public void setFk_idcategoria(long fk_idcategoria) {
		this.fk_idcategoria = fk_idcategoria;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
