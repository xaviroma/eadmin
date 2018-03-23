package es.fpdual.eadmin.eadmin.servicio;

import es.fpdual.eadmin.eadmin.modelo.Documento;
import es.fpdual.eadmin.eadmin.modelo.Expediente;

public interface ServicioExpediente {
	
	public abstract Documento altaExpediente(Expediente expediente);

	public abstract Documento modificarExpediente(Expediente expediente);

	public abstract void eliminarExpediente(Integer codigo);
	
	public abstract void asociarDocumentoAlExpediente(Expediente expediente, Documento documento);
	
	public abstract void desasociarDocumentoDelExpediente(Expediente expediente, Documento documento);

}