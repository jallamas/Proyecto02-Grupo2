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
	12/12/2018

	-Se realizaron los requisitos del proyecto
	-Creación de las clases POIO en el paquete MODEL
	-Distribución de Tareas

	13/12/2018
	
	-Recoger información.
	-Creación de Métodos
	-Creación de las clases 
	-Inicialización de Variables en el Main (Principal)
	-Impresiones de Pantalla de Victoria, Instrucciones, Introducción y Array de jugadores.

	Desde el día 13/12/2018 - Hasta el día 21/12/2018
	
	-Organización de ideas sobre el Main (Clase principal).
	-Búsqueda de preguntas con sus respuestas correspondientes.
	-Creación de Arrays para Preguntas y Respuestas 
	-Creación de otro Array para distinguir entre Pregunta y Reto
	-Llamamientos hacia el Main.
	-Creación de la partida con el número de jugadores, puntos de victoria,
	 probabilidad de obtener un comodín, probabilidad de robar un comodín, la lista de jugadores
	 y las preguntas y retos.
	

	Desde el día 21/12/2018 - Hasta el día 11/1/2019
	
	-Rellenar Arrays  de preguntas y respuestas
	-Impresiones de robo de comodín y de obtención de comodín.
	-Métodos de usar comodín, elegir responder o usar comodín, comprobar ganador alcanzando los puntos necesarios 
	 y comprobar ganador por puntos alcanzado en el máximo de rondas, en Crud Partida.
	-Método crear jugador  y alternar elección del jugador para las siguientes rondas, en Crud Jugador
	-En Crud Actividades, método para imprimir preguntas con sus correspondientes respuestas de forma aleatoria, 
	 un método para comprobar las respuestas correctas y otro método para imprimir preguntas en el caso de que 
	 no se disponga de un comodín.
	-Llamamientos al main, pedir datos a los jugadores para crear la partida y creación de la primera ronda 
	 y de las siguientes a partir de esta.
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
			
			/*Rellenamos el Array de los jugadores*/
			for (int i = cero; i < numjugadores; i++) {
				TextosPrincipal.pedirNombreJugador(i);
				nombreJug = Leer.dato();
				Jugador j = new Jugador(nombreJug, puntuacion, comodines, eleccion);
				listaJug[i] = j;
			}
			/*Creamos la partida*/
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
					if(opcion < cero || opcion > cuatro) {
						System.out.println("Por favor, introduzca una opción válida.");
					}
				}while(opcion < cero || opcion > cuatro);
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
							if(opcion < cero || opcion > cuatro) {
								System.out.println("Por favor, introduzca una opción válida.");
							}
						}while(opcion < cero || opcion > cuatro);
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
