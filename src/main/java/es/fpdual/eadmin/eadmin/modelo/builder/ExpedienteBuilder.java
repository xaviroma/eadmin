package es.fpdual.eadmin.eadmin.modelo.builder;

import java.util.Date;

import es.fpdual.eadmin.eadmin.modelo.Documento;
import es.fpdual.eadmin.eadmin.modelo.EstadoExpediente;

public class ExpedienteBuilder {
	
	protected Integer codigo;
	protected String nombre;
	protected Date fechaCreacion;
	protected Boolean publico;
	protected Date fechaUltimaModificacion;
	protected Date fechaArchivado;
	protected EstadoExpediente estado;
	
	public Expediente construir() {
		return new Expediente(codigo, nombre, fechaCreacion, publico, fechaUltimaModificacion, fechaArchivado, estado);
	}

}
