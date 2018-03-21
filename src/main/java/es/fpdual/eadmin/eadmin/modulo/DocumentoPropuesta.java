package es.fpdual.eadmin.eadmin.modulo;

import java.util.Date;

public class DocumentoPropuesta extends Documento {
	
	private Integer codigo_pro;
	private Integer ejercicio;
	private String grupoPolitico;
	
	
	public DocumentoPropuesta(Integer codigo, String nombre, Date fechaCreacion, Boolean publico,
			EstadoDocumento estado, Integer codigo_prop, Integer ejercicio, String grupoPolitico) {
		super(codigo, nombre, fechaCreacion, publico, estado);
		this.codigo_pro = codigo_prop;
		this.ejercicio = ejercicio;
		this.grupoPolitico = grupoPolitico;
	}


	
	public Integer getCodigo_pro() {
		return codigo_pro;
	}

	public Integer getEjercicio() {
		return ejercicio;
	}


	public String getGrupoPolitico() {
		return grupoPolitico;
	}


	@Override
	public String toString() {
		return "DocumentoPropuesta [codigo=" + codigo_pro + ", ejercicio=" + ejercicio + ", grupoPolitico=" + grupoPolitico
				+ "]";
	}
	

	

}
