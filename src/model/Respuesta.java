package model;

public class Respuesta {
	// atributos
	private String texto;
	private boolean verdaderoFalso;

	public Respuesta() {

	}

	public Respuesta(String texto, boolean verdaderoFalso) {
		super();
		this.texto = texto;
		this.verdaderoFalso = verdaderoFalso;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public boolean getVerdaderoFalso() {
		return verdaderoFalso;
	}

	public void setVerdaderoFalso(boolean verdaderoFalso) {
		this.verdaderoFalso = verdaderoFalso;
	}

	@Override
	public String toString() {
		return "Respuestas [texto=" + texto + ", verdaderoFalso=" + verdaderoFalso + "]";
	}

}
