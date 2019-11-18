package com.carlosgarcia.autentia.model;

public class Curso{
	
	private long id;
	private String titulo;
	private boolean activo;
	private long id_profesor;
	private float horas;
	private String nivel;
	
//	public Curso() {
//		
//	}
	
	public Curso(long id, String titulo, boolean activo, long id_profesor, float horas, String nivel) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.activo = activo;
		this.id_profesor = id_profesor;
		this.horas = horas;
		this.nivel = nivel;
	}
	
	/*public Curso(String titulo, boolean activo, long id_profesor, float horas, String nivel) {
		super();
		this.titulo = titulo;
		this.activo = activo;
		this.id_profesor = id_profesor;
		this.horas = horas;
		this.nivel = nivel;
	}*/
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public long getId_profesor() {
		return id_profesor;
	}
	public void setId_profesor(long id_profesor) {
		this.id_profesor = id_profesor;
	}
	public float getHoras() {
		return horas;
	}
	public void setHoras(float horas) {
		this.horas = horas;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	@Override
	public String toString() {
		return "Curso [id=" + id + ", titulo=" + titulo + ", activo=" + activo + ", id_profesor=" + id_profesor
				+ ", horas=" + horas + ", nivel=" + nivel + "]";
	}
	
	
	
	

}
