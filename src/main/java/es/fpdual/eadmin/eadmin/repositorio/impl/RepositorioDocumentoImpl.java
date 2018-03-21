package es.fpdual.eadmin.eadmin.repositorio.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import es.fpdual.eadmin.eadmin.modelo.Documento;
import es.fpdual.eadmin.eadmin.repositorio.RepositorioDocumento;

@Repository
public class RepositorioDocumentoImpl implements RepositorioDocumento {
	
	private List<Documento> documentos = new ArrayList<>();
	
	public List<Documento> getDocumentos() {
		return documentos;
	}

	@Override
	public void altaDocumento(Documento documento) {
		if (documentos.contains(documento)) {
			throw new IllegalArgumentException("El documento ya existe.");
		}
		
		documentos.add(documento);
	}

	@Override
	public void modificarDocumento(Documento documento) {
		if (documentos.contains(documento)) {
			throw new IllegalArgumentException("El documento ha modificar no existe.");
		}
		
		documentos.set(documentos.indexOf(documento),documento);
		
	}

	@Override
	public void eliminarDocumento(Integer codigo) {
		
		Documento documentoEncontrado = null;
		
		for (int i = 0; i< documentos.size(); i++) {
			if(documentos.get(i).getCodigo().equals(codigo)) {
				documentoEncontrado = documentos.get(i);
				break;
			}
		}
		
		if (documentoEncontrado != null) {
			documentos.remove(documentoEncontrado);
		}
	}
	
	

}