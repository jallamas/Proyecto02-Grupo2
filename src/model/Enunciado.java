package model;

import java.util.Arrays;

public class Enunciado {

	String enunciado;
	int tipo;
	Respuesta lista[];
	
	public Enunciado () {
		
	}

	public Enunciado(String enunciado, int tipo, Respuesta[] lista) {
		super();
		this.enunciado = enunciado;
		this.tipo = tipo;
		this.lista = lista;
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

	public Respuesta[] getLista() {
		return lista;
	}

	public void setLista(Respuesta[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Enunciados [enunciado=" + enunciado + ", tipo=" + tipo + ", lista=" + Arrays.toString(lista) + "]";
	}

	
}