package crud;

import model.Actividades;
import model.Jugador;
import model.Partida;

public class Crudpartida {

	public Crudpartida() {

	}

	/* CREA LA PARTIDA. */
	public Partida crearPartida(int numJug, int ptosVict, double probabilidadComodin, double probabilidadRobarComodin,
			Jugador[] jugadores, Actividades[] listaPreguntas, Actividades[] listaRetos) {
		int maxRondas = 0;
		if (ptosVict <= 20) {
			maxRondas = ptosVict + 2;
		} else if (ptosVict > 20) {
			maxRondas = ptosVict + (ptosVict * 20 / 100);
		}
		Partida p = new Partida(numJug, ptosVict, maxRondas, probabilidadComodin, probabilidadRobarComodin, jugadores,
				listaPreguntas, listaRetos);
		return p;
	}

	// USAR COMODÍN.
	public void usarComodin(Jugador j) {
		if (j.getComodines() > 0) {
			j.setComodines(j.getComodines() - 1);
			j.setPuntuacion(j.getPuntuacion() + 1);
			System.out.println("Has usado un comodín.");
			System.out.printf("Te quedan %d comodines", j.getComodines());
		}
	}

	// ELIGE ENTRE USAR RESPUESTA O COMODIN.
	public void elegirSolucion(int opcion, int aleatorio, boolean eleccion, Jugador j, Jugador[] listajug,
			int probcomodin, int probrobar) {
		if (opcion == 0) {
			usarComodin(j);
		} else {
			CrudActividades ca = new CrudActividades();
			ca.comprobarRespuesta(opcion, aleatorio, eleccion, j, listajug, probcomodin, probrobar);
		}
	}

	// COMPROBAR GANADOR ALCANZADO OBJETIVO.

	public int comprobarGanador(Jugador[] lista, int puntosVictoria) {
		int numeroGanadores = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].getPuntuacion() >= puntosVictoria) {
				System.out.printf("\nENHORABUENA!!! %s, HAS GANADO!!!\n", lista[i].getNombre());
				numeroGanadores++;
			}
		}
		return numeroGanadores;
	}

	// COMPROBAR GANADOR POR PUNTOS ALCANZADO EL MÁXIMO DE RONDAS.

	public void comprobarPuntos(Jugador[] lista) {
		int puntosganador = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].getPuntuacion() > puntosganador) {
				puntosganador = lista[i].getPuntuacion();
			}
		}
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].getPuntuacion() == puntosganador) {
				System.out.printf("ENHORABUENA!!! %s, HAS GANADO!!!\n\n", lista[i].getNombre());
			}
		}
	}

}
