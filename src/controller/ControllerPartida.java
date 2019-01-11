package controller;

import java.util.Random;
import vista.ImprimirJugadores;
import model.Jugador;
import utilidades.Leer;
import vista.ImprimirComodinObtenido;
import vista.ImprimirRobo;

public class ControllerPartida {

	public void generarEvento(Jugador j1, Jugador j2[], int probmascomodin, int probrobarcomodin) {
		Random r = new Random();
		int aleatorio = r.nextInt(100 - 1) + 1;
		if (aleatorio <= probmascomodin) {
			ImprimirComodinObtenido.imprimirObtenerComodin();
			darComodin(j1);
		} else if (aleatorio > probmascomodin && aleatorio <= (probmascomodin + probrobarcomodin)) {
			ImprimirRobo.imprimirRobo();
			robarComodin(j1, j2);
		}

	}

	public static void darComodin(Jugador j1) {
		int uno = 1;
		j1.setComodines(j1.getComodines() + uno);
	}

	public static void robarComodin(Jugador j, Jugador j2[]) {
		int opcion;
		int uno = 1;
		darComodin(j);
		ImprimirJugadores.ImprimirJugador(j2);
		do {
			System.out.println("Elija una opción");
			opcion = Leer.datoInt();
			if (j2[opcion - uno].getComodines() != 0) {
			} else {
				System.out.println("Este jugador no tiene comodines, elije otro");
			}
		} while (j2[opcion - uno].getComodines() == 0);
		j2[opcion - uno].setComodines(j2[opcion - uno].getComodines() - uno);
	}

	public void limpiarPantalla() {
		int lineas = 5;
		for (int i = 0; i < lineas; i++) {
			System.out.println(" ");
		}
	}

	public void mostrarMarcador(int numjugadores, Jugador j1, Jugador[] listaJug) {
		limpiarPantalla();
		System.out.println("Así están los marcadores:\n");
		for (int i = 0; i < numjugadores; i++) {
			j1 = listaJug[i];
			System.out.printf("%s: %d puntos.\n", j1.getNombre(), j1.getPuntuacion());
		}
		for (int i = 0; i < numjugadores; i++) {
			j1 = listaJug[i];
			System.out.printf("\nA %s le quedan %d comodín/es.\n", j1.getNombre(), j1.getComodines());
		}
	}
}
