package vista;

import model.Jugador;

public class TextosPrincipal {

	public static void tocarNormal() {
		System.out.println("Le toca una pregunta normal.\n");
	}

	public static void tocarReto() {
		System.out.println("Le toca una pregunta específica o un reto.\n");
	}

	public static void indicarNumeroJugadores() {
		System.out.println("\nIndique el número de jugadores (1-4)");
	}

	public static void pedirPuntosVictoria() {
		System.out.println("¿Cuántos puntos son necesarios para vencer?");
	}

	public static void pedirNombreJugador(int i) {
		System.out.printf("Escriba el nombre del jugador %d", i + 1);
	}

	public static void indicarTurno(Jugador j1) {
		System.out.printf("Turno de %s.\n", j1.getNombre());
	}

	public static void elegirNormaloReto() {
		System.out.println("Escriba [1] para elegir una pregunta normal.\nEscriba[2] para reto o pregunta específica.");
	}

	public static void mostrarOpcionIncorrecta() {
		System.out.println("Por favor, introduzca una opción válida.");
	}

	public static void pedirRespuestaoComodin() {
		System.out.println("0. Usar un comodín.\n");
		System.out.println("Elija la respuesta correcta o utilice un comodín:");
	}

	public static void informarCeroComodines() {
		System.out.println("Lo sentimos. No tienes comodines disponibles.");
	}

	public static void pedirRespuesta() {
		System.out.println("Elige una respuesta.");
	}

	public static void mostrarNumeroRonda(int rondaactual) {
		System.out.printf("RONDA NÚMERO %d.\n", rondaactual);
	}

	public static void preguntarJugarOtra() {
		System.out.println("¿Desea jugar otra partida?. Escriba [1] para jugar o cualquier otro número para terminar.");
	}
}
