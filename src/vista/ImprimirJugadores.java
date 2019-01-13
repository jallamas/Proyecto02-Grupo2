package vista;

import model.Jugador;

public class ImprimirJugadores {

	public static void ImprimirJugadores(Jugador l1[]) {
		for (int i = 0; i < l1.length; i++) {
			System.out.printf("%d. %s\n", i + 1, l1[i].getNombre());
		}
	}
}
