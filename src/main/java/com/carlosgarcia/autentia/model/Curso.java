package com.carlosgarcia.autentia.model;

// TODO: Auto-generated Javadoc
/**
 * The Class Curso.
 */
public class Curso{
	
	/** The id. */
	private long id;
	
	/** The titulo. */
	private String titulo;
	
	/** The activo. */
	private boolean activo;
	
	/** The id profesor. */
	private long id_profesor;
	
	/** The horas. */
	private float horas;
	
	/** The nivel. */
	private String nivel;
	
//	public Curso() {
//		
//	}
	
	/**
 * Instantiates a new curso.
 *
 * @param id the id
 * @param titulo the titulo
 * @param activo the activo
 * @param id_profesor the id profesor
 * @param horas the horas
 * @param nivel the nivel
 */
public Curso(long id, String titulo, boolean activo, long id_profesor, float horas, String nivel) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.activo = activo;
		this.id_profesor = id_profesor;
		this.horas = horas;
		this.nivel = nivel;
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
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
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * Gets the titulo.
	 *
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	
	/**
	 * Sets the titulo.
	 *
	 * @param titulo the new titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/**
	 * Checks if is activo.
	 *
	 * @return true, if is activo
	 */
	public boolean isActivo() {
		return activo;
	}
	
	/**
	 * Sets the activo.
	 *
	 * @param activo the new activo
	 */
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	/**
	 * Gets the id profesor.
	 *
	 * @return the id profesor
	 */
	public long getId_profesor() {
		return id_profesor;
	}
	
	/**
	 * Sets the id profesor.
	 *
	 * @param id_profesor the new id profesor
	 */
	public void setId_profesor(long id_profesor) {
		this.id_profesor = id_profesor;
	}
	
	/**
	 * Gets the horas.
	 *
	 * @return the horas
	 */
	public float getHoras() {
		return horas;
	}
	
	/**
	 * Sets the horas.
	 *
	 * @param horas the new horas
	 */
	public void setHoras(float horas) {
		this.horas = horas;
	}
	
	/**
	 * Gets the nivel.
	 *
	 * @return the nivel
	 */
	public String getNivel() {
		return nivel;
	}
	
	/**
	 * Sets the nivel.
	 *
	 * @param nivel the new nivel
	 */
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Curso [id=" + id + ", titulo=" + titulo + ", activo=" + activo + ", id_profesor=" + id_profesor
				+ ", horas=" + horas + ", nivel=" + nivel + "]";
	}
	
	
	
	

}
