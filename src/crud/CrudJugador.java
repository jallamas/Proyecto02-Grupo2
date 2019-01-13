package crud;

import model.Jugador;

public class CrudJugador {

	// CREAR JUGADOR

	public Jugador anyadirJugador(String nombre, int puntuacion, int comodinesactuales, boolean eleccion) {

		Jugador j = new Jugador(nombre, puntuacion, comodinesactuales, eleccion);

		return j;
	}

	/* CAMBIA LA ELECCION DEL JUGADOR PARA LAS SIGUIENTES RONDAS */
	public void cambiarEleccion(Jugador j1) {
		if (j1.isEleccion() == true) {
			j1.setEleccion(false);
		} else if (j1.isEleccion() == false) {
			j1.setEleccion(true);
		}

	}
}
