package lartizco.erp.user.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AD_USUARIO database table.
 * 
 */
@Entity
@Table(name="AD_USUARIO")
@NamedQuery(name="AdUsuario.findAll", query="SELECT a FROM AdUsuario a")
public class AdUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ADU_CODIGO")
	private int aduCodigo;

	@Column(name="ADU_EMPRESA")
	private String aduEmpresa;

	@Column(name="ADU_NOMBRE")
	private String aduNombre;

	public AdUsuario() {
	}

	public int getAduCodigo() {
		return this.aduCodigo;
	}

	public void setAduCodigo(int aduCodigo) {
		this.aduCodigo = aduCodigo;
	}

	public String getAduEmpresa() {
		return this.aduEmpresa;
	}

	public void setAduEmpresa(String aduEmpresa) {
		this.aduEmpresa = aduEmpresa;
	}

	public String getAduNombre() {
		return this.aduNombre;
	}

	public void setAduNombre(String aduNombre) {
		this.aduNombre = aduNombre;
	}

	@Override
	public String toString() {
	    return "AdUsuario [aduCodigo=" + aduCodigo + ", aduEmpresa=" + aduEmpresa + ", aduNombre=" + aduNombre
		    + "]";
	}	

}