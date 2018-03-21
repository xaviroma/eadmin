package es.fpdual.eadmin.eadmin.modulo;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class DocumentoContableTest {
	
	private static final Integer CODIGO_DOCUMENTO = 1;
	private static final String NOMBRE_DOCUMENTO = "nombre";
	private static final Date FECHA_CREACION = new Date();
	private static final Boolean DOCUMENTO_PUBLICO = true;
	private static final BigDecimal IMPORTE = new java.math.BigDecimal("0");
	private static final String NIFINTERESADO = "nombre";

	
	Documento_Contable doc_cont1;
	@Before
	public void Inicializar() {
		doc_cont1 = new Documento_Contable(CODIGO_DOCUMENTO, NOMBRE_DOCUMENTO, FECHA_CREACION, DOCUMENTO_PUBLICO, EstadoDocumento.ACTIVO, IMPORTE, NIFINTERESADO);
	}
	
	@Test
	public void DOCUMENTO_CONTABLE() {
				
		assertEquals(IMPORTE, doc_cont1.getImporte());
		assertEquals(NIFINTERESADO, doc_cont1.getDNI_Interesado());
	
	}

}
