package es.fpdual.eadmin.eadmin.servicio.impl;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.*;
import org.junit.Before;
import org.junit.Test;

import es.fpdual.eadmin.eadmin.modelo.Documento;
import es.fpdual.eadmin.eadmin.modelo.EstadoDocumento;
import es.fpdual.eadmin.eadmin.repositorio.RepositorioDocumento;
import es.fpdual.eadmin.eadmin.repositorio.impl.RepositorioDocumentoImpl;
import es.fpdual.eadmin.eadmin.servicio.ServicioDocumento;

public class ServicioDocumentoImplTest {
	
	private ServicioDocumento servicioDocumento;

	private static final Documento DOCUMENTO = mock (Documento.class);
	
	private final RepositorioDocumento repositorioDocumento = mock (RepositorioDocumento.class);
	
	@Before
	public void InicializarEnCadaTest() {
		
		this.servicioDocumento = new ServicioDocumentoImpl(repositorioDocumento);
		
	}
	
	@Test
	public void deberiaAlmacenarUnDocumento() {
		
		when(DOCUMENTO.getCodigo()).thenReturn(1);
		when(DOCUMENTO.getNombre()).thenReturn("nombre");
		when(DOCUMENTO.getFechaCreacion()).thenReturn(new Date(1/1/2018));
		
		final Documento resultado = this.servicioDocumento.altaDocumento(DOCUMENTO);
		
		verify(this.repositorioDocumento).altaDocumento(any());
		assertEquals(Integer.valueOf(1),resultado.getCodigo());
		assertEquals(resultado.getNombre(), "nombre");
		assertNotEquals(resultado.getFechaCreacion(), DOCUMENTO.getFechaCreacion());
	}
	
	@Test
	public void deberiaModificarUnDocumento() {
		
		when(DOCUMENTO.getCodigo()).thenReturn(1);
		when(DOCUMENTO.getNombre()).thenReturn("nombre");
		when(DOCUMENTO.getFechaUltimaModificacion()).thenReturn(null);
		
		final Documento resultado = this.servicioDocumento.modificarDocumento(DOCUMENTO);
		
		verify(this.repositorioDocumento).modificarDocumento(any());
		assertEquals(Integer.valueOf(1),resultado.getCodigo());
		assertEquals(resultado.getNombre(), "nombre");
		assertNotEquals(resultado.getFechaUltimaModificacion(), DOCUMENTO.getFechaUltimaModificacion());
	}
	
	@Test
	public void deberiaEliminarUnDocumento() {
		
		when(DOCUMENTO.getCodigo()).thenReturn(1);
		
		this.servicioDocumento.eliminarDocumento(DOCUMENTO.getCodigo());
		
		verify(this.repositorioDocumento).eliminarDocumento(1);
	}

}

