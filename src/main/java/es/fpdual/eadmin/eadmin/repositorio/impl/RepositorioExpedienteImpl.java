package es.fpdual.eadmin.eadmin.repositorio.impl;

import java.util.ArrayList;
import java.util.List;

import es.fpdual.eadmin.eadmin.modelo.Documento;
import es.fpdual.eadmin.eadmin.modelo.Expediente;
import es.fpdual.eadmin.eadmin.repositorio.RepositorioExpediente;

public class RepositorioExpedienteImpl implements RepositorioExpediente{
	
	private List<Expediente> expedientes = new ArrayList<>();
	
	public List<Expediente> getExpedientes() {
		return expedientes;
	}
	
	// Con esto obtengo la lista completa con todos los expedientes.	


	@Override
	public void altaExpediente(Expediente expediente) {
		if (expedientes.contains(expediente)) {
			throw new IllegalArgumentException("El documento ya existe.");
		}
		
		expedientes.add(expediente);
	}

	@Override
	public void modificarExpediente(Expediente expediente) {
		if (!expedientes.contains(expediente)) {
			throw new IllegalArgumentException("El documento ha modificar no existe.");
		}
		
		expedientes.set(expedientes.indexOf(expediente),expediente);
		
	}

	@Override
	public void eliminarExpediente(Integer codigo) {
		Expediente documentoEncontrado = expedientes.stream().
				filter(d -> tieneIgualCodigo(d, codigo)).
				findFirst().orElseGet(null);
				
				
		if (documentoEncontrado != null) {
			expedientes.remove(documentoEncontrado);
		}
	}

	@Override
	public void asociarDocumentoAlExpediente(Integer codigoExpediente, Documento documento) {
		
		Expediente documentoEncontrado = expedientes.stream().
				filter(d -> tieneIgualCodigo(d, codigoExpediente)).
				findFirst().orElseGet(null);
		
		if (documentoEncontrado != null) {
			Expediente.getDocumentos();
		}
		
		//expedientes.get(getExpedientes().indexOf(expediente)).getDocumentos().add(documento);
		
	}

	@Override
	public void desasociarDocumentoDelExpediente(Integer codigoExpediente, Integer codigoDocumento) {
		
		//expedientes.get(getExpedientes().indexOf(expediente)).getDocumentos().remove(documento);		
		
	}

	protected boolean tieneIgualCodigo(Expediente expediente, Integer codigo) {
		return expediente.getCodigo().equals(codigo);
	}

}
