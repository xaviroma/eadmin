package es.fpdual.eadmin.eadmin.modulo;

import java.util.Date;

public class Documento_Registro extends Documento {
	
	private String nifInteresado;
	private String controlRegistro;
	
	
	public Documento_Registro(Integer codigo, String nombre, Date fechaCreacion, Boolean publico,
			EstadoDocumento estado, String nifInteresado, String controlRegistro) {
		super(codigo, nombre, fechaCreacion, publico, estado);
		this.nifInteresado = nifInteresado;
		this.controlRegistro = controlRegistro;
	}


	
	public String getNifInteresado() {
		return nifInteresado;
	}


	public String getControlRegistro() {
		return controlRegistro;
	}



	@Override
	public String toString() {
		return "Documento_Registro [nifInteresado=" + nifInteresado + ", controlRegistro=" + controlRegistro + "]";
	}
	

}
