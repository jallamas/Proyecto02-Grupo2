package crud;

import model.Jugador;

public class CrudJugador {

	//Añadir un jugador
	
	public Jugador anyadirJugador(String nombre, int puntuacion,int comodinesactuales,boolean eleccion) {
		
		Jugador j= new Jugador(nombre,puntuacion, comodinesactuales,eleccion);
		
		return j;
	}
	
	
}
