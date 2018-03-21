package es.fpdual.eadmin.eadmin.modulo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class AdministracionElectronicaBaseTest {
	
	public class AdministracionElectronicaBaseFake extends AdministracionElectronicaBase{

		public AdministracionElectronicaBaseFake(Integer codigo, String nombre, Date fechaCreacion, Boolean publico) {
			super(codigo, nombre, fechaCreacion, publico);
		}
		
	}
	
	private static final Integer CODIGO_DOCUMENTO = 1;
	private static final String NOMBRE_DOCUMENTO = "nombre";
	private static final Date FECHA_CREACION = new Date();
	private static final Boolean DOCUMENTO_PUBLICO = true;

	
	AdministracionElectronicaBaseFake doc1;
	@Before
	public void Inicializar() {
		doc1 = new AdministracionElectronicaBaseFake(CODIGO_DOCUMENTO, NOMBRE_DOCUMENTO, FECHA_CREACION, DOCUMENTO_PUBLICO);
	}
	
	@Test
	public void DOCUMENTO_CONTABLE() {
		
		assertEquals(CODIGO_DOCUMENTO, doc1.getCodigo());
		assertEquals(NOMBRE_DOCUMENTO, doc1.getNombre());
		assertEquals(FECHA_CREACION, doc1.getFechaCreacion());
		assertEquals(DOCUMENTO_PUBLICO, doc1.getPublico());
	
	}
	
	@Test
	public void deberiaDevolverHasCodeDelCodigo() {
		final int resultado = doc1.hashCode();
		AdministracionElectronicaBaseFake doc2;
		doc2 = new AdministracionElectronicaBaseFake(1, null, null, null);
		
		assertEquals(resultado, doc2.hashCode());
	}
	
	@Test
	public void deberiaDevolverFalseSiNoEsUnDocumento() {
		final boolean resultado = doc1.equals(new Date());
		assertFalse(resultado);
	}

}
