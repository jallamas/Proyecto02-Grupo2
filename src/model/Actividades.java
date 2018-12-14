package model;

import java.util.Arrays;

public class Actividades {

	private String enunciado;
	private int tipo; // 0 para "preguntas normales" ó 1 para "Retos y Preguntas específicas"
	private static int puntos; // Valor de la repuesta correcta
	private Respuesta []respuestas;
	
	



	public Actividades(String enunciado, int tipo, Respuesta[] respuestas) {
		this.enunciado = enunciado;
		this.tipo = tipo;
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


	public static int getPuntos() {
		return puntos;
	}


	public static void setPuntos(int puntos) {
		Actividades.puntos = puntos;
	}


	public Respuesta[] getRespuestas() {
		return respuestas;
	}


	public void setRespuestas(Respuesta[] respuestas) {
		this.respuestas = respuestas;
	}


	@Override
	public String toString() {
		return "Actividades [enunciado=" + enunciado + ", tipo=" + tipo + ", puntos=" + puntos + ", dificultad="
				+ ", respuestas=" + Arrays.toString(respuestas) + "]";
	}
	
	
	
}
