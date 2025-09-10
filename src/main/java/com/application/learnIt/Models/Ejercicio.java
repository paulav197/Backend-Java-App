package com.application.learnIt.Models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ejercicio")
public class Ejercicio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "tipo_ejercicio")
	private String tipoEjercicio;
	
	@Column(name = "instruccion")
	private String instruccion;
	
	@Column(name = "operando1_visible")
	private int operando1Visible;
	
	@Column(name = "resultado_visible")
	private int resultadoVisible;
	
	@Column(name = "respuesta_correcta")
	private int respuestaCorrecta;
	
	@Column(name = "nivel")
	private String nivel;
	
	@Column(name = "respuesta_usuario")
	private Integer respuestaUsuario;
	
	@Column(name = "es_correcto")
	private Boolean esCorrecto;
	
	public Ejercicio() {
		super();
	}

	public Ejercicio(Long id, String tipoEjercicio, String instruccion, int operando1Visible, int resultadoVisible,
			int respuestaCorrecta, String nivel, Integer respuestaUsuario, Boolean esCorrecto) {
		super();
		this.id = id;
		this.tipoEjercicio = tipoEjercicio;
		this.instruccion = instruccion;
		this.operando1Visible = operando1Visible;
		this.resultadoVisible = resultadoVisible;
		this.respuestaCorrecta = respuestaCorrecta;
		this.nivel = nivel;
		this.respuestaUsuario = respuestaUsuario;
		this.esCorrecto = esCorrecto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoEjercicio() {
		return tipoEjercicio;
	}

	public void setTipoEjercicio(String tipoEjercicio) {
		this.tipoEjercicio = tipoEjercicio;
	}

	public String getInstruccion() {
		return instruccion;
	}

	public void setInstruccion(String instruccion) {
		this.instruccion = instruccion;
	}

	public int getOperando1Visible() {
		return operando1Visible;
	}

	public void setOperando1Visible(int operando1Visible) {
		this.operando1Visible = operando1Visible;
	}

	public int getResultadoVisible() {
		return resultadoVisible;
	}

	public void setResultadoVisible(int resultadoVisible) {
		this.resultadoVisible = resultadoVisible;
	}

	public int getRespuestaCorrecta() {
		return respuestaCorrecta;
	}

	public void setRespuestaCorrecta(int respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public Integer getRespuestaUsuario() {
		return respuestaUsuario;
	}

	public void setRespuestaUsuario(Integer respuestaUsuario) {
		this.respuestaUsuario = respuestaUsuario;
	}

	public Boolean getEsCorrecto() {
		return esCorrecto;
	}

	public void setEsCorrecto(Boolean esCorrecto) {
		this.esCorrecto = esCorrecto;
	}
}