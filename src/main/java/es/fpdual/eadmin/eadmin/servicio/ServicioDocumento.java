package es.fpdual.eadmin.eadmin.servicio;

import es.fpdual.eadmin.eadmin.modelo.Documento;

public interface ServicioDocumento {
	
	public abstract Documento altaDocumento(Documento documento);

	public abstract Documento modificarDocumento(Documento documento);

	public abstract void eliminarDocumento(Integer codigo);
	

}
