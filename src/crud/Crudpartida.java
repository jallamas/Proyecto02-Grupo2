package crud;

import model.Jugador;
import model.Partida;
import utilidades.Probabilidad;

public class Crudpartida {

	public Partida crearPartida(int numJug, int ptosVict, double probabilidadComodin, double probabilidadRobarComodin,
			Jugador[] jugadores) {
		int maxRondas = 0;
		if (ptosVict <= 20) {
			maxRondas = ptosVict + 2;
		} else if (ptosVict > 20) {
			maxRondas = ptosVict + (ptosVict * 20 / 100);
		}
		Partida p = new Partida(numJug, ptosVict, maxRondas, probabilidadComodin, probabilidadRobarComodin, jugadores,
				null);
		return p;
	}

	public void generarEvento() {
		float probabilidad = 0.70F;
		int numeroProbable = 3;
		int opciones = 3;
		int res = Probabilidad.generarProbabilidad(opciones, numeroProbable, probabilidad);

		if (res == 1) {

			// darComodin();
		}

		else if (res == 2) {

			// Robar comodin
		}

	}
	// public void darComodin(Jugador j1) {
	//
	// int comodines = j1.getComodinesactuales();
	// comodines = comodines++;
	//
	// }

	public void quitarComodin(Jugador l1[], int opcion) {
		for (int i = 0; i < l1.length; i++) {
			System.out.println(i++ + "-" + l1[i].getNombre());
		}
	}
}
