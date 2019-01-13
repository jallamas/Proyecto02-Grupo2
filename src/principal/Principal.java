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
import vista.TextosPrincipal;

/*PROYECTO REALIZADO POR EL GRUPO 2, COMPUESTO POR:
 * JOSÉ ANTONIO LLAMAS EL COORDINADOR
 * VÍCTOR MIRANDA ENCARGADO DEL MANTENIMIENTO/SECRETARIO
 * ALBERTO SANTIAGO RELACIONES PÚBLICAS
 * RICARDO MEJÍAS INVESTIGADOR
 ------------------------------------------------------------------------
	
	- Se definieron los requisitos del proyecto (VÍCTOR Y JOSÉ ANTONIO)
	- Distribución de Tareas (JOSÉ ANTONIO)
	- Creación de las clases (JOSÉ ANTONIO, RICARDO Y VÍCTOR)
	- Búsqueda de preguntas con sus respuestas correspondientes. (ALBERTO)
	
	CLASES:
	- ControllerPartida:
			* Método para obtener o robar un comodín según probabilidad (RICARDO)
	 		* Método para sumar un comodín (JOSÉ ANTONIO)
	 		* Método para sumar un comodín a un jugador y quitárselo a otro (JOSÉ ANTONIO)
	 		* Método para separar con líneas en blanco (JOSÉ ANTONIO)
	 		* Método mostrar el marcador de puntos y comodines (JOSÉ ANTONIO)
	- CrudActividades:
			* Método para imprimir preguntas con sus correspondientes respuestas de forma aleatoria (RICARDO)
			* Método para comprobar las respuestas correctas (RICARDO)
			* Método para imprimir de nuevo la misma pregunta en el caso de que no se disponga de un comodín (ALBERTO Y VÍCTOR)
	- CrudJugador;
	 		* Método para crear un jugador (JOSÉ ANTONIO)
	 		* Método para alternar la elección del tipo de pregunta de un jugador de una ronda a otra. (JOSÉ ANTONIO)
	- CrudPartida:
			* Método que crea la partida (JOSÉ ANTONIO)
			* Método para usar un comodín (JOSÉ ANTONIO)
			* Método para elegir entre responder la pregunta o usar un comodín (JOSÉ ANTONIO)
			* Método para comprobar ganador llegando al objetivo (JOSÉ ANTONIO)
			* Método paras comprobar ganador alcanzando el máximo de rondas (JOSÉ ANTONIO)
	- DatosPreguntas:
			* Arrays de preguntas y respuestas (VÍCTOR)
	- Model:
			* Clases POJO definiendo objetos principales (JOSÉ ANTONIO)
	- Principal:
			* Construcción del Main (JOSÉ ANTONIO).
			* Corrección de errores en algunas situaciones del desarrollo del programa (ALBERTO Y VÍCTOR)
	- Vista:
			* Método para imprimir imágen de ganar un comodín (VÍCTOR)
			* Método para imprimir imágen de Introducción (RICARDO)
			* Método para imprimir imágen de Instrucciones (RICARDO)
			* Método para imprimir lista de jugadores (JOSÉ ANTONIO)
			* Método para imprimir imágen de robar comodín (ALBERTO)
			* Método para imprimir imágen de victoria (RICARDO)
			* Método para imprimir textos durante la ejecución del programa (JOSÉ ANTONIO)
	 		
	 */

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		int terminar;
		int uno = 1;
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
			int cero = 0, dos = 2, cuatro = 4;

			// Pantallas iniciales

			ImprimirIntroduccion.imprimirIntroduccion();
			conp.limpiarPantalla();
			ImprimirIntrucciones.imprimirInstrucciones();
			ImprimirIntrucciones.imprimirGuia();

			// Pedimos los datos para crear la partida

			TextosPrincipal.indicarNumeroJugadores();
			numjugadores = Leer.datoInt();
			listaJug = new Jugador[numjugadores];

			TextosPrincipal.pedirPuntosVictoria();
			puntVictoria = Leer.datoInt();

			/* Rellenamos el Array de los jugadores */
			for (int i = cero; i < numjugadores; i++) {
				TextosPrincipal.pedirNombreJugador(i);
				nombreJug = Leer.dato();
				Jugador j = new Jugador(nombreJug, puntuacion, comodines, eleccion);
				listaJug[i] = j;
			}
			/* Creamos la partida */
			p = cp.crearPartida(numjugadores, puntVictoria, probComodin, probRobarComodin, listaJug,
					dp0.obtenerPreguntas(), dp0.obtenerRetos());

			// PRIMERA RONDA
			conp.limpiarPantalla();
			for (int i = cero; i < numjugadores; i++) {
				j1 = listaJug[i];
				conp.limpiarPantalla();
				TextosPrincipal.indicarTurno(j1);
				do {
					TextosPrincipal.elegirNormaloReto();
					opcion = Leer.datoInt();
					switch (opcion) {
					case 1:
						j1.setEleccion(true);
						break;
					case 2:
						j1.setEleccion(false);
						break;
					default:
						TextosPrincipal.mostrarOpcionIncorrecta();
						break;
					}
				} while (opcion != uno && opcion != dos);

				numeropregunta = a1.imprimirPregunta(j1.isEleccion());
				TextosPrincipal.pedirRespuestaoComodin();
				do {
					opcion = Leer.datoInt();
					if (opcion < cero || opcion > cuatro) {
						TextosPrincipal.mostrarOpcionIncorrecta();
					}
				} while (opcion < cero || opcion > cuatro);
				if (opcion == cero && j1.getComodines() == cero) {
					TextosPrincipal.informarCeroComodines();
					do {
						TextosPrincipal.pedirRespuesta();
						a1.imprimirPreguntaSinComodin(j1.isEleccion(), numeropregunta);
						opcion = Leer.datoInt();
					} while (opcion < uno || opcion > cuatro);
				}

				cp.elegirSolucion(opcion, numeropregunta, j1.isEleccion(), j1, listaJug, probComodin, probRobarComodin);
			}
			conp.mostrarMarcador(numjugadores, j1, listaJug);
			if (cp.comprobarGanador(listaJug, puntVictoria) == cero) {
				rondaactual = uno;

				// SIGUIENTES RONDAS
				do {
					rondaactual++;
					conp.limpiarPantalla();
					TextosPrincipal.mostrarNumeroRonda(rondaactual);
					for (int i = cero; i < numjugadores; i++) {
						j1 = listaJug[i];
						conp.limpiarPantalla();
						TextosPrincipal.indicarTurno(j1);
						cj.cambiarEleccion(j1);
						if (j1.isEleccion() == true) {
							TextosPrincipal.tocarNormal();
						} else {
							TextosPrincipal.tocarReto();
						}
						numeropregunta = a1.imprimirPregunta(j1.isEleccion());
						TextosPrincipal.pedirRespuestaoComodin();
						do {
							opcion = Leer.datoInt();
							if (opcion < cero || opcion > cuatro) {
								TextosPrincipal.mostrarOpcionIncorrecta();
							}
						} while (opcion < cero || opcion > cuatro);
						if (opcion == cero && j1.getComodines() == cero) {
							TextosPrincipal.informarCeroComodines();
							do {
								TextosPrincipal.pedirRespuesta();
								a1.imprimirPreguntaSinComodin(j1.isEleccion(), numeropregunta);
								opcion = Leer.datoInt();
							} while (opcion < uno || opcion > cuatro);
						}

						cp.elegirSolucion(opcion, numeropregunta, j1.isEleccion(), j1, listaJug, probComodin,
								probRobarComodin);
					}
					conp.mostrarMarcador(numjugadores, j1, listaJug);
					numganadores = cp.comprobarGanador(listaJug, puntVictoria);
				} while (rondaactual < p.getNumMaxRondas() && numganadores == cero);
				if (numganadores == cero) {
					cp.comprobarPuntos(listaJug);
				}
				ImprimirVictoria.imprimirVictoria();
			}
			TextosPrincipal.preguntarJugarOtra();
			terminar = Leer.datoInt();
		} while (terminar == uno);
	}
}
