package datos;

public class Respuestas {
	//atributos
	String texto;
	int verdaderoFalso;
	
	public Respuestas() {
		
	}
	public Respuestas(String texto, int verdaderoFalso) {
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
	public int getVerdaderoFalso() {
		return verdaderoFalso;
	}
	public void setVerdaderoFalso(int verdaderoFalso) {
		this.verdaderoFalso = verdaderoFalso;
	}
	@Override
	public String toString() {
		return "Respuestas [texto=" + texto + ", verdaderoFalso=" + verdaderoFalso + "]";
	}
	
	
	
	
	

}
