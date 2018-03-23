package es.fpdual.eadmin.eadmin.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import es.fpdual.eadmin.eadmin.repositorio.RepositorioDocumento;

public class Expediente extends AdministracionElectronicaBase {

	private  Date fechaArchivado = null;
	private  EstadoExpediente estado;
	
	// Creamos una lista de documentos.
	private final List<Documento> documentos;	
	
	public Expediente(Integer codigo, String nombre, Date fechaCreacion, Boolean publico, Date fechaUltimaModificacion,
			Date fechaArchivado, EstadoExpediente estado, List<Documento> documentos) {
		super(codigo, nombre, fechaCreacion, publico, fechaUltimaModificacion);
		this.estado = estado;
		this.documentos = documentos;
	}


	public Date getFechaArchivado() {
		return fechaArchivado;
	}

	public EstadoExpediente getEstado() {
		return estado;
	}

	public List<Documento> getDocumentos() {
		return documentos;
	}


	/*
	public void archivar() {
		if(this.fechaArchivado == null) {
			this.fechaArchivado = new Date();
			this.estado = EstadoExpediente.ARCHIVADO;
		}
	}
	*/
	
	@Override
	public int hashCode() {
		return getCodigo().hashCode() + getNombre().hashCode() + getFechaCreacion().hashCode() + getPublico().hashCode() + getEstado().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Expediente) {
			return getCodigo().equals(((Expediente) obj).getCodigo()) && 
					getNombre().equals(((Expediente) obj).getNombre()) &&
					getFechaCreacion().equals(((Expediente) obj).getFechaCreacion()) &&
					getPublico().equals(((Expediente) obj).getPublico());
		}
		return false;
	}
	
	
	
	

}
