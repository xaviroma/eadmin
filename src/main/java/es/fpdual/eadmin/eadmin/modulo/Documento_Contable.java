package es.fpdual.eadmin.eadmin.modulo;


import java.math.BigDecimal;
import java.util.Date;


public class Documento_Contable extends Documento {
	
	private BigDecimal importe;
	private String nifInteresado;
	

	public Documento_Contable(Integer codigo, String nombre, Date fechaCreacion, Boolean publico,
			EstadoDocumento estado, BigDecimal importe, String nifInteresado) {
		super(codigo, nombre, fechaCreacion, publico, estado);
		this.importe = importe;
		this.nifInteresado = nifInteresado;
	}

	public BigDecimal getImporte() {
		return importe;
	}

	public String getDNI_Interesado() {
		return nifInteresado;
	}

	@Override
	public String toString() {
		return "Documento_Contable [importe=" + importe + ", DNI_Interesado=" + nifInteresado + "]";
	}
	
}
