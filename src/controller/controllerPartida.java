package controller;

import java.util.Random;
import vista.ImprimirJugadores;
import model.Jugador;

public class controllerPartida {

	public void generarEvento(Jugador j1, int probmascomodin, int probrobarcomodin) {
		Random r = new Random();
		int aleatorio = r.nextInt(100 - 1) + 1;
		if (aleatorio <= probmascomodin) {
			// darComodin();
		} else if (aleatorio > probmascomodin && aleatorio <= probrobarcomodin) {
			// RobarComodin();
		}

	}

	public static void darComodin(Jugador j1) {
		int uno = 1;
		j1.setComodines(j1.getComodines() + uno);
	}

	public static void robarComodin(Jugador j1[], int opcion) {
		ImprimirJugadores.ImprimirJugador(j1);
		int res = j1[opcion - 1].getComodines();
		res = res--;

	}

	public void limpiarPantalla() {
		for (int i = 0; i < 15; i++) {
			System.out.println(" ");
		}
	}
}
