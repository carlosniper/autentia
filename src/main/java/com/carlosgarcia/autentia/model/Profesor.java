package com.carlosgarcia.autentia.model;

public class Profesor {
	
	private long id;
	private String nombre;
	
	public Profesor(long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	public long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
