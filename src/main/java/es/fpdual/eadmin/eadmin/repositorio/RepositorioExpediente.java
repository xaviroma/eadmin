package es.fpdual.eadmin.eadmin.repositorio;

import es.fpdual.eadmin.eadmin.modelo.Documento;
import es.fpdual.eadmin.eadmin.modelo.Expediente;

public interface RepositorioExpediente {
	
	public abstract void altaExpediente(Expediente expediente);
	
	public abstract void modificarExpediente (Expediente expediente);
	
	public abstract void eliminarExpediente (Integer codigo);
	
	public abstract void asociarDocumentoAlExpediente(Expediente expediente, Documento documento);
	
	public abstract void desasociarDocumentoDelExpediente(Expediente expediente, Documento documento);
	

}
