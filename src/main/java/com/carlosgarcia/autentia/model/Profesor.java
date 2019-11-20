package com.carlosgarcia.autentia.model;

// TODO: Auto-generated Javadoc
/**
 * The Class Profesor.
 */
public class Profesor {
	
	/** The id. */
	private long id;
	
	/** The nombre. */
	private String nombre;
	
	/**
	 * Instantiates a new profesor.
	 *
	 * @param id the id
	 * @param nombre the nombre
	 */
	public Profesor(long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
