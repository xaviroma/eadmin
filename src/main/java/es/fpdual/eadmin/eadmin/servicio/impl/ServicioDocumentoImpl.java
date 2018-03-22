package es.fpdual.eadmin.eadmin.servicio.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import es.fpdual.eadmin.eadmin.modelo.Documento;
import es.fpdual.eadmin.eadmin.repositorio.RepositorioDocumento;
import es.fpdual.eadmin.eadmin.servicio.ServicioDocumento;

@Service
public class ServicioDocumentoImpl implements ServicioDocumento {
	
	RepositorioDocumento repositorioDocumento;
	
	@Autowired
	public ServicioDocumentoImpl (RepositorioDocumento repositorioDocumento) {
		this.repositorioDocumento = repositorioDocumento;
	}

	@Override
	public Documento altaDocumento(Documento documento) {
		
		final Documento documentoModificado = devolverConFechaCorrecta(documento);
		
		repositorioDocumento.altaDocumento(documentoModificado);
		
		return documentoModificado;
		
	}

	@Override
	public Documento modificarDocumento(Documento documento) {
		
		final Documento documentoFechaModificacion = agregarFechaModificacion(documento);
		
		repositorioDocumento.modificarDocumento(documentoFechaModificacion);
		
		return documentoFechaModificacion;
	
		
	}

	
	@Override
	public void eliminarDocumento(Integer codigo) {
		repositorioDocumento.eliminarDocumento(codigo);
		
	}
	
	
	protected Documento agregarFechaModificacion(Documento documento) {
		return new Documento(documento.getCodigo(),
				documento.getNombre(),
				documento.getFechaCreacion(),
				documento.getPublico(),
				dameFechaActual(),
				documento.getEstado());
	}


	protected Documento devolverConFechaCorrecta(Documento documento) {
		return new Documento(documento.getCodigo(),
				documento.getNombre(),
				dameFechaActual(),
				documento.getPublico(),
				documento.getFechaUltimaModificacion(),
				documento.getEstado());
	}
	

	protected Date dameFechaActual() {
		return new Date();
	}
	

}
