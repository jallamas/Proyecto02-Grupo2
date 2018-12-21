package model;

public class Jugador {

	private String nombre;
	private int puntuacion;
	private int comodines;
	private boolean eleccion;// True si ha elegido pregunta y false si es reto

	public Jugador() {
	}

	public Jugador(String nombre, int puntuacion, int comodines, boolean eleccion) {
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.comodines = comodines;
		this.eleccion = eleccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public int getComodines() {
		return comodines;
	}

	public void setComodines(int comodines) {
		this.comodines = comodines;
	}

	public boolean isEleccion() {
		return eleccion;
	}

	public void setEleccion(boolean eleccion) {
		this.eleccion = eleccion;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", puntuacion=" + puntuacion + ", comodines=" + comodines + ", eleccion="
				+ eleccion + "]";
	}

}
