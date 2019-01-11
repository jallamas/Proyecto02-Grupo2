package principal;

import controller.ControllerPartida;
import crud.CrudActividades;
import crud.CrudJugador;
import crud.Crudpartida;
import datos.DatosPreguntas;
import model.Jugador;
import model.Partida;
import utilidades.Leer;
import vista.ImprimirIntroduccion;
import vista.ImprimirIntrucciones;
import vista.ImprimirVictoria;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		int terminar;
		do {
			// Variables con valor fijo
			int puntuacion = 0; // Puntos con los que comienza un jugador
			int comodines = 1; // Número de comodines con los que comienza la partida un jugador
			boolean eleccion = true; // True si ha elegido pregunta común y False si ha elegido Reto o pregunta
										// específica.
			int probComodin = 20; // Porcentaje de probabilidad de que te "toque" un comodín al responder
									// correctamente una pregunta
			int probRobarComodin = 20; // Porcentaje de probabilidad de que se te permita "robar" un comodín a un
										// compañero al responder correctamente una pregunta

			// Variables para crear la partida

			int numjugadores = 0; // Número de jugadores
			int puntVictoria = 0; // Puntos necesarios para ganar.
			Jugador[] listaJug;
			String nombreJug;
			DatosPreguntas dp0 = new DatosPreguntas();
			Crudpartida cp = new Crudpartida();
			Partida p;
			Jugador j1 = new Jugador();
			CrudJugador cj = new CrudJugador();
			CrudActividades a1 = new CrudActividades();
			ControllerPartida conp = new ControllerPartida();

			// Variables auxiliares
			int opcion = 0;
			int rondaactual = 0;
			int numganadores = 0;
			int numeropregunta = 0;
			int uno = 1, cuatro = 4;

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
			p = cp.crearPartida(numjugadores, puntVictoria, probComodin, probRobarComodin, listaJug,
					dp0.obtenerPreguntas(), dp0.obtenerRetos());

			// PRIMERA RONDA
			conp.limpiarPantalla();
			for (int i = 0; i < numjugadores; i++) {
				j1 = listaJug[i];
				conp.limpiarPantalla();
				System.out.printf("Turno de %s.\n", j1.getNombre());
				do {
					System.out.println(
							"Escriba [1] para elegir una pregunta normal.\nEscriba[2] para reto o pregunta específica.");

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
				} while (opcion != 1 && opcion != 2);

				numeropregunta = a1.imprimirPregunta(j1.isEleccion());
				System.out.println("0. Usar un comodín.");
				System.out.println("Elija la respuesta correcta o utilice un comodín:");
				opcion = Leer.datoInt();
				if (opcion == 0 && j1.getComodines() == 0) {
					System.out.println("Lo sentimos. No tienes comodines disponibles.");
					do {
						System.out.println("Elige una respuesta.");
						a1.imprimirPreguntaSinComodin(j1.isEleccion(), numeropregunta);
						opcion = Leer.datoInt();
					} while (opcion < uno || opcion > cuatro);
				}

				cp.elegirSolucion(opcion,numeropregunta, j1.isEleccion(), j1, listaJug, probComodin, probRobarComodin);
			}
			conp.limpiarPantalla();
			System.out.println("Así están los marcadores:\n");
			for (int i = 0; i < numjugadores; i++) {
				j1 = listaJug[i];
				System.out.printf("%s: %d puntos.\n", j1.getNombre(), j1.getPuntuacion());
			}
			if (cp.comprobarGanador(listaJug, puntVictoria) == 0) {
				rondaactual = 1;
				// SIGUIENTES RONDAS
				do {
					rondaactual++;
					conp.limpiarPantalla();
					System.out.printf("RONDA NÚMERO %d.\n", rondaactual);
					for (int i = 0; i < numjugadores; i++) {
						j1 = listaJug[i];
						System.out.printf("Turno de %s.\n\n", j1.getNombre());
						cj.cambiarEleccion(j1);
						if (j1.isEleccion() == true) {
							System.out.println("Le toca una pregunta normal.\n");
						} else {
							System.out.println("Le toca una pregunta específica o un reto.\n");
						}
						numeropregunta = a1.imprimirPregunta(j1.isEleccion());
						System.out.println("0. Usar un comodín.");
						System.out.println("\nElija la respuesta correcta o utilice un comodín:");
						opcion = Leer.datoInt();
						if (opcion == 0 && j1.getComodines() == 0) {
							System.out.println("Lo sentimos. No tienes comodines disponibles.");
							do {
								System.out.println("Elige una respuesta.");
								a1.imprimirPreguntaSinComodin(j1.isEleccion(), numeropregunta);
								opcion = Leer.datoInt();
							} while (opcion < uno || opcion > cuatro);
						}

						cp.elegirSolucion(opcion,numeropregunta, j1.isEleccion(), j1, listaJug, probComodin, probRobarComodin);
					}
					conp.limpiarPantalla();
					System.out.println("Así están los marcadores:\n");
					for (int i = 0; i < numjugadores; i++) {
						j1 = listaJug[i];
						System.out.printf("%s: %d puntos.\n", j1.getNombre(), j1.getPuntuacion());
					}

					for (int i = 0; i < numjugadores; i++) {
						System.out.println(listaJug[i]);
					}
					numganadores = cp.comprobarGanador(listaJug, puntVictoria);
				} while (rondaactual < p.getNumMaxRondas() && numganadores == 0);
				if (numganadores == 0) {
					cp.comprobarPuntos(listaJug);
				}
				ImprimirVictoria.imprimirVictoria();
			}
			System.out.println(
					"¿Desea jugar otra partida?. Escriba [1] para jugar o cualquier otro número para terminar.");
			terminar = Leer.datoInt();
		} while (terminar == 1);
	}
}
