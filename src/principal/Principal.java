package principal;

import model.Jugador;
import utilidades.Leer;
import vista.ImprimirIntroduccion;
import vista.ImprimirIntrucciones;
import crud.Crudpartida;
import datos.datosPreguntas;
import model.Partida;
import crud.CrudActividades;
import crud.CrudJugador;
import controller.controllerPartida;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		// Variables con valor fijo
		int puntuacion = 0; // Puntos con los que comienza un jugador
		int comodines = 1; // Número de comodines con los que comienza la partida un jugador
		boolean eleccion = true; // True si ha elegido pregunta común y False si ha elegido Reto o pregunta
									// específica.
		double probComodin = 10; // Porcentaje de probabilidad de que te "toque" un comodín al responder
									// correctamente una pregunta
		double probRobarComodin = 10; // Porcentaje de probabilidad de que se te permita "robar" un comodín a un
										// compañero al responder correctamente una pregunta

		// Variables para crear la partida

		int numjugadores = 0; // Número de jugadores
		int puntVictoria = 0; // Puntos necesarios para ganar.
		Jugador[] listaJug;
		String nombreJug;
		datosPreguntas dp0 = new datosPreguntas();
		Crudpartida cp = new Crudpartida();
		Partida p;
		Jugador j1 = new Jugador();
		CrudJugador cj = new CrudJugador();
		CrudActividades a1 = new CrudActividades();
		controllerPartida conp = new controllerPartida();

		// Pantallas iniciales

		ImprimirIntroduccion.imprimirIntroduccion();
		conp.limpiarPantalla();
		ImprimirIntrucciones.imprimirInstrucciones();
		ImprimirIntrucciones.imprimirGuia();

		// Pedimos los datos para crear la partida

		System.out.println("\nIndique el número de jugadores (1-4)");
		numjugadores = Leer.datoInt();
		listaJug = new Jugador[numjugadores];

		System.out.println("¿Cuántos puntos son necesarios para vencer?");
		puntVictoria = Leer.datoInt();

		for (int i = 0; i < numjugadores; i++) {
			System.out.printf("Escriba el nombre del jugador %d", i + 1);
			nombreJug = Leer.dato();
			Jugador j = new Jugador(nombreJug, puntuacion, comodines, eleccion);
			listaJug[i] = j;
		}
		p = cp.crearPartida(numjugadores, puntVictoria, probComodin, probRobarComodin, listaJug, dp0.obtenerPreguntas(),
				dp0.obtenerRetos());

		// Elegimos quién comienza

		/*
		 * conp.limpiarPantalla(); System.out.println("Vamos a elegir quién comienza.");
		 * System.out.printf("%s, ¡te ha tocado empezar!\n\n",cp.elegirTurno(p).
		 * getNombre());
		 */
		// Primera ronda
		conp.limpiarPantalla();
		for (int i = 0; i < numjugadores; i++) {
			j1 = listaJug[i];
			System.out.printf("Turno de %s.\n", j1.getNombre());
			System.out.println(
					"Escriba [1] para elegir una pregunta normal.\nEscriba[2] para reto o pregunta específica.");
			int opcion;
			opcion = Leer.datoInt();
			switch (opcion) {
			case 1:
				j1.setEleccion(true);
				break;
			case 2:
				j1.setEleccion(false);
				break;
			default:
				System.out.println("Opción incorrecta.");
			}
			
			a1.imprimirPregunta(j1.isEleccion());
			conp.limpiarPantalla();
		}
		conp.limpiarPantalla();
		System.out.println("Así están los marcadores:\n");
		for (int i = 0; i < numjugadores; i++) {
			j1 = listaJug[i];
			System.out.printf("%s: %d puntos.\n",j1.getNombre(),j1.getPuntuacion());
		}

		for (int i = 0; i < numjugadores; i++) {
			System.out.println(listaJug[i]);
		}
	}
}
