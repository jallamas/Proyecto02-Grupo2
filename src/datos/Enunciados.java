package datos;

import java.util.Arrays;

public class Enunciados {

	String enunciado;
	int tipo;
	Respuestas lista[];
	
	public Enunciados () {
		
	}

	public Enunciados(String enunciado, int tipo, Respuestas[] lista) {
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

	public Respuestas[] getLista() {
		return lista;
	}

	public void setLista(Respuestas[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Enunciados [enunciado=" + enunciado + ", tipo=" + tipo + ", lista=" + Arrays.toString(lista) + "]";
	}

	
}