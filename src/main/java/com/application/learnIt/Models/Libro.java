package com.application.learnIt.Models;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="libro")

public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String autor;
	
	@Column(columnDefinition = "TEXT")
	private String contenido;
	private String ilustracion;
	private String ruta_pdf;
	
	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name = "libro_textos", joinColumns =  @JoinColumn(name = "libro_id"))
	@Column(name = "texto")
	private List<String> textPage;
	
	public Libro() {
		super();
	}

	public Libro(Long id, String titulo, String autor, String contenido, String ilustracion, String ruta_pdf, List<String> textPage) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.contenido = contenido;
		this.ilustracion = ilustracion;
		this.ruta_pdf = ruta_pdf;
		this.textPage = textPage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getIlustracion() {
		return ilustracion;
	}

	public void setIlustracion(String ilustracion) {
		this.ilustracion = ilustracion;
	}

	public String getRuta_pdf() {
		return ruta_pdf;
	}

	public void setRuta_pdf(String ruta_pdf) {
		this.ruta_pdf = ruta_pdf;
	}

	public List<String> getTextPage() {
		return textPage;
	}

	public void setTextPage(List<String> textPage) {
		this.textPage = textPage;
	}
	

}
