package es.fpdual.eadmin.eadmin.modelo;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import es.fpdual.eadmin.eadmin.repositorio.impl.RepositorioDocumentoImpl;

public class RepositorioDocumentoTest {
	
	private static final Integer CODIGO_DOCUMENTO = 1;
	private static final String NOMBRE_DOCUMENTO = "nombre";
	private static final Date FECHA_CREACION = new Date();
	private static final Boolean DOCUMENTO_PUBLICO = true;
	
	Documento documento1;
	
	@Before
	public void Inicializar() {
		documento1 = new Documento(CODIGO_DOCUMENTO, NOMBRE_DOCUMENTO, FECHA_CREACION, DOCUMENTO_PUBLICO, EstadoDocumento.ACTIVO);
	}
	
	@Test
	public void probarAlta() {
		RepositorioDocumentoImpl RepositorioDocumento = new RepositorioDocumentoImpl();
		
		RepositorioDocumento.altaDocumento(documento1);
	}
	
	@Test
	public void modificarDocumento() {
		RepositorioDocumentoImpl RepositorioDocumento = new RepositorioDocumentoImpl();
		
		RepositorioDocumento.modificarDocumento(documento1);
	}
	
	@Test
	public void eliminarDocumento() {
		RepositorioDocumentoImpl RepositorioDocumento = new RepositorioDocumentoImpl();
		
		RepositorioDocumento.eliminarDocumento(CODIGO_DOCUMENTO);
	}


}
