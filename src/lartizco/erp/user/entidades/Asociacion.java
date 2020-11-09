package lartizco.erp.user.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ASOCIACION database table.
 * 
 */
@Entity
@NamedQuery(name="Asociacion.findAll", query="SELECT a FROM Asociacion a")
public class Asociacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String nombre;

	public Asociacion() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
	    return "Asociacion [id=" + id + ", nombre=" + nombre + "]";
	}
	
	

}