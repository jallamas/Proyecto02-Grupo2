package controller;

import java.util.Random;
import vista.ImprimirJugadores;
import model.Jugador;
import utilidades.Leer;
import vista.ImprimirComodinObtenido;
import vista.ImprimirRobo;

public class controllerPartida {

	public void generarEvento(Jugador j1, Jugador j2[], int probmascomodin, int probrobarcomodin) {
		Random r = new Random();
		int aleatorio = r.nextInt(100 - 1) + 1;
		if (aleatorio <= probmascomodin) {
			ImprimirComodinObtenido.imprimirObtenerComodin();
			darComodin(j1);
		} else if (aleatorio > probmascomodin && aleatorio <= probrobarcomodin) {
			ImprimirRobo.imprimirRobo();
			darComodin(j1);
			robarComodin(j2);
		}

	}

	public static void darComodin(Jugador j1) {
		int uno = 1;
		j1.setComodines(j1.getComodines() + uno);
	}

	public static void robarComodin(Jugador j2[]) {
		int opcion;
		int uno = 1;
		ImprimirJugadores.ImprimirJugador(j2);
		do {
			System.out.println("Elija una opción");
			opcion = Leer.datoInt();
			if (j2[opcion - uno].getComodines() != 0) {
				j2[opcion - 1].setComodines(j2[opcion - uno].getComodines() - uno);
			} else {
				System.out.println("Este jugador no tiene comodines, elije otro");
			}
		} while (j2[opcion - 1].getComodines() == 0);
	}

	public void limpiarPantalla() {
		for (int i = 0; i < 15; i++) {
			System.out.println(" ");
		}
	}
}
