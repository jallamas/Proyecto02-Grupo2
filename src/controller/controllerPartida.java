package controller;

import model.Jugador;
import utilidades.Probabilidad;

public class controllerPartida {

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
