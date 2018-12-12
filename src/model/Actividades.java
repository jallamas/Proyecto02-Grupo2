package model;

import java.util.Arrays;

public class Actividades {

	private String enunciado;
	private int tipo; // 0 para "preguntas normales" ó 1 para "Retos y Preguntas específicas"
	private int puntos; // Valor de la repuesta correcta
	private int dificultad; // Nivel de dificultad (entre 1 y 5)
	private String [][]respuestas;
	
	
	public Actividades(String enunciado, int tipo, int puntos, int dificultad, String[][] respuestas) {
		this.enunciado = enunciado;
		this.tipo = tipo;
		this.puntos = puntos;
		this.dificultad = dificultad;
		this.respuestas = respuestas;
	}


	public String getEnunciado() {
		return enunciado;
	}


	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public int getPuntos() {
		return puntos;
	}


	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}


	public int getDificultad() {
		return dificultad;
	}


	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}


	public String[][] getRespuestas() {
		return respuestas;
	}


	public void setRespuestas(String[][] respuestas) {
		this.respuestas = respuestas;
	}


	@Override
	public String toString() {
		return "Actividades [enunciado=" + enunciado + ", tipo=" + tipo + ", puntos=" + puntos + ", dificultad="
				+ dificultad + ", respuestas=" + Arrays.toString(respuestas) + "]";
	}
	
	
	
}
