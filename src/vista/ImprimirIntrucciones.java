package vista;

public class ImprimirIntrucciones {

	public static void imprimirInstrucciones() {

		System.out.println(" ___ __ __      ________       ___   __       __  __       ________       __          \r\n"
				+ "/__//_//_/\\    /_______/\\     /__/\\ /__/\\    /_/\\/_/\\     /_______/\\     /_/\\         \r\n"
				+ "\\::\\| \\| \\ \\   \\::: _  \\ \\    \\::\\_\\\\  \\ \\   \\:\\ \\:\\ \\    \\::: _  \\ \\    \\:\\ \\        \r\n"
				+ " \\:.      \\ \\   \\::(_)  \\ \\    \\:. `-\\  \\ \\   \\:\\ \\:\\ \\    \\::(_)  \\ \\    \\:\\ \\       \r\n"
				+ "  \\:.\\-/\\  \\ \\   \\:: __  \\ \\    \\:. _    \\ \\   \\:\\ \\:\\ \\    \\:: __  \\ \\    \\:\\ \\____  \r\n"
				+ "   \\. \\  \\  \\ \\   \\:.\\ \\  \\ \\    \\. \\`-\\  \\ \\   \\:\\_\\:\\ \\    \\:.\\ \\  \\ \\    \\:\\/___/\\ \r\n"
				+ "    \\__\\/ \\__\\/    \\__\\/\\__\\/     \\__\\/ \\__\\/    \\_____\\/     \\__\\/\\__\\/     \\_____\\/ \r\n"
				+ "                                                                                 ");

		System.out.println("\t\t\t  ______       ______      \r\n" + "\t\t\t/_____/\\     /_____/\\     \r\n"
				+ "\t\t\t\\:::_ \\ \\    \\::::_\\/_    \r\n" + "\t\t\t \\:\\ \\ \\ \\    \\:\\/___/\\   \r\n"
				+ "\t\t\t  \\:\\ \\ \\ \\    \\::___\\/_  \r\n" + "\t\t\t   \\:\\/.:| |    \\:\\____/\\ \r\n"
				+ "\t\t\t    \\____/_/     \\_____\\/ \r\n" + "\t\t\t                          ");
		System.out.println("\t\t\t  __  __       ______       ______      \r\n"
				+ "\t\t\t/_/\\/_/\\     /_____/\\     /_____/\\     \r\n"
				+ "\t\t\t\\:\\ \\:\\ \\    \\::::_\\/_    \\:::_ \\ \\    \r\n"
				+ "\t\t\t \\:\\ \\:\\ \\    \\:\\/___/\\    \\:\\ \\ \\ \\   \r\n"
				+ "\t\t\t  \\:\\ \\:\\ \\    \\_::._\\:\\    \\:\\ \\ \\ \\  \r\n"
				+ "\t\t\t   \\:\\_\\:\\ \\     /____\\:\\    \\:\\_\\ \\ \\ \r\n"
				+ "\t\t\t    \\_____\\/     \\_____\\/     \\_____\\/ \r\n"
				+ "\t\t\t                                       ");
	}

	public static void imprimirGuia() {
		System.out.println("1º-Elegimos el número de jugadores.");
		System.out.println("2º-Elegimos la puntuación necesaria para vencer.");
		System.out.println(
				"3º-Elegimos entre pregunta o reto(No te preocupes, se alternan automaticamente en cada turno.)");
		System.out.println(
				"4º-Por cada pregunta o reto ganas 1 punto (Algunos retos requieren la valoración del resto de jugadores.)");
		System.out.println(
				"5º-Por cada pregunta o reto respondido correctamente, existe una probabilidad de que puedas ganar un comodín o tener la oportunidad de robar uno a otro jugador.");
		System.out.println("6º-Los comodines sirven para superar preguntas o retos.");
		System.out.println("7º-Cuando consigas los puntos necesarios, habrás ganado.");
		System.out.println(
				"8º- En el caso de que se llegue al número máximo de rondas y no haya ganador, vencerá//n el/los jugador/es con más puntos.");

	}
}
