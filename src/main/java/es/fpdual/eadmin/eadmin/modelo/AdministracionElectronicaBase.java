package es.fpdual.eadmin.eadmin.modelo;

import java.util.Date;

public abstract class AdministracionElectronicaBase {
	
	private Integer codigo;
	private String nombre;
	private Date fechaCreacion;
	private Boolean publico;
	private Date fechaUltimaModificacion;
	
	
	public AdministracionElectronicaBase(Integer codigo, String nombre, 
			Date fechaCreacion, Boolean publico, Date fechaUltimaModificacion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.fechaCreacion = fechaCreacion;
		this.publico = publico;
		this.fechaUltimaModificacion = null;
	}


	public Integer getCodigo() {
		return codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public Date getFechaCreacion() {
		return fechaCreacion;
	}


	public Boolean getPublico() {
		return publico;
	}
	
	public Date getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}


	@Override
	public int hashCode() {
		return codigo.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AdministracionElectronicaBase) {
			return codigo.equals(((AdministracionElectronicaBase) obj).getCodigo());
		}
		return false;
	}

}
