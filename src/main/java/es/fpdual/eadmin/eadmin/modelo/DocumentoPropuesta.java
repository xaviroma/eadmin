package es.fpdual.eadmin.eadmin.modelo;

import java.util.Date;

public class DocumentoPropuesta extends Documento {
	
	private Integer codigoPro;
	private Integer ejercicio;
	private String grupoPolitico;
	
	
	public DocumentoPropuesta(Integer codigo, String nombre, Date fechaCreacion, Boolean publico,
			EstadoDocumento estado, Integer codigoProp, Integer ejercicio, String grupoPolitico) {
		super(codigo, nombre, fechaCreacion, publico, estado);
		this.codigoPro = codigoProp;
		this.ejercicio = ejercicio;
		this.grupoPolitico = grupoPolitico;
	}


	
	public Integer getCodigo_pro() {
		return codigoPro;
	}

	public Integer getEjercicio() {
		return ejercicio;
	}


	public String getGrupoPolitico() {
		return grupoPolitico;
	}


	@Override
	public String toString() {
		return "DocumentoPropuesta [codigo=" + codigoPro + ", ejercicio=" + ejercicio + ", grupoPolitico=" + grupoPolitico
				+ "]";
	}
	

	

}
