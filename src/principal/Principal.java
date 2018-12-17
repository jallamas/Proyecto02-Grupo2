package principal;

import model.Jugador;
import utilidades.Leer;
import vista.ImprimirIntroduccion;
import vista.ImprimirIntrucciones;


public class Principal {

	public static void main(String[] args) throws InterruptedException{
		// Variables con valor fijo
		int puntuacion = 0; // Puntos con los que comienza un jugador
		int comodines = 1; // Número de comodines con los que comienza la partida un jugador
		boolean eleccion = true; // True si ha elegido pregunta común y False si ha elegido Reto o pregunta específica.
		double probComodin = 0.1; // Porcentaje de probabilidad de que te "toque" un comodín al responder correctamente una pregunta
		double probRobarComodin = 0.1; // Porcentaje de probabilidad de que se te permita "robar" un comodín a un
										// compañero al responder correctamente una pregunta
		
		// Variables para crear la partida
		
		int numjugadores=0; //Número de jugadores
		int puntVictoria=0; //Puntos necesarios para ganar.
		Jugador []listaJug;
		String nombreJug;
		
		//Pantallas iniciales
		
		ImprimirIntroduccion.imprimirIntroduccion();
		for (int i=0;i<15;i++) {
			System.out.println(" ");
		}
		ImprimirIntrucciones.imprimirInstrucciones();
		ImprimirIntrucciones.imprimirGuia();
		
		//Pedimos los datos para crear la partida
			
		System.out.println("Indique el número de jugadores (1-4)");
		numjugadores=Leer.datoInt();
		listaJug=new Jugador[numjugadores];
		
		System.out.println("¿Cuántos puntos son necesarios para vencer?");
		puntVictoria=Leer.datoInt();
		
		for (int i=0;i<numjugadores;i++) {
			System.out.printf("Escriba el nombre del jugador %d",i+1);
			nombreJug=Leer.dato();
			Jugador j=new Jugador(nombreJug,puntuacion,comodines,eleccion);
			listaJug[i]=j;
		}
		
		for (int i=0;i<numjugadores;i++) {
			System.out.println(listaJug[i]);
		}
	
	
	
	
	}

	
}
