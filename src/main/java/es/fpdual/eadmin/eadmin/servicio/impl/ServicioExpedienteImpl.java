package es.fpdual.eadmin.eadmin.servicio.impl;

import es.fpdual.eadmin.eadmin.modelo.Documento;
import es.fpdual.eadmin.eadmin.modelo.Expediente;
import es.fpdual.eadmin.eadmin.repositorio.RepositorioExpediente;
import es.fpdual.eadmin.eadmin.servicio.ServicioExpediente;

public class ServicioExpedienteImpl implements ServicioExpediente{
	
	RepositorioExpediente repositorioExpediente;

	@Override
	public Documento altaExpediente(Expediente expediente) {
		
		final Expediente expedienteModificado = devolverConFechaCorrecta(expediente);
		
		repositorioExpediente.altaExpediente(expedienteModificado);
		return expedienteModificado;
	}

	
	@Override
	public Documento modificarExpediente(Expediente expediente) {

		return null;
	}

	@Override
	public void eliminarExpediente(Integer codigo) {
		
	}

	@Override
	public void asociarDocumentoAlExpediente(Expediente expediente, Documento documento) {
		
	}

	@Override
	public void desasociarDocumentoDelExpediente(Expediente expediente, Documento documento) {
		
	}
	
	
	protected Expediente devolverConFechaCorrecta(Expediente expediente) {
		
		
		return null;
	}

}
