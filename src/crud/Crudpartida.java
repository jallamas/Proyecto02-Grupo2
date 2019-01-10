package crud;

import model.Actividades;
import model.Jugador;
import model.Partida;
import java.util.Random;

public class Crudpartida {

	public Crudpartida() {

	}

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

	// Elegimos quién empieza a jugar

	public Jugador elegirTurno(Partida p) {
		Random r = new Random();
		System.out.println(p.getNumjugadores());
		int ale = r.nextInt(p.getNumjugadores());
		return p.getJugadores()[ale];
	}

	// TODO Metodo para comprobar respuesta
	// Usar comodín
	public void usarComodin(Jugador j) {
		if (j.getComodines() > 0) {
			j.setComodines(j.getComodines() - 1);
			j.setPuntuacion(j.getPuntuacion() + 1);
			System.out.println("Has usado un comodín.");
			System.out.printf("Te quedan %d comodines", j.getComodines());

		} else {
			System.out.println("Lo sentimos. No tienes comodines disponibles.");
			System.out.println("Elige una respuesta.");
		}
	}

	// Respuesta o comodin
	public void elegirSolucion(int opcion, boolean eleccion, Jugador j, Jugador[] listajug, int probcomodin, int probrobar) throws InterruptedException {
		if (opcion == 0) {
			usarComodin(j);
		} else {
			CrudActividades ca = new CrudActividades();
			ca.comprobarRespuesta(opcion, eleccion, j, listajug, probcomodin,probrobar);
		}
	}
}
