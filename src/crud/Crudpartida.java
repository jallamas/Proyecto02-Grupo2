package crud;

import model.Actividades;
import model.Jugador;
import model.Partida;
import java.util.Random;


public class Crudpartida {
		
	public Crudpartida() {
		
	}
	
	public Partida crearPartida(int numJug, int ptosVict, double probabilidadComodin, double probabilidadRobarComodin,
			Jugador[] jugadores,Actividades[]listaPreguntas,Actividades[]listaRetos) {
		int maxRondas = 0;
		if (ptosVict <= 20) {
			maxRondas = ptosVict + 2;
		} else if (ptosVict > 20) {
			maxRondas = ptosVict + (ptosVict * 20 / 100);
		}
		Partida p = new Partida(numJug, ptosVict, maxRondas, probabilidadComodin, probabilidadRobarComodin, jugadores,
				listaPreguntas,listaRetos);
		return p;
	}
	
	//Elegimos quién empieza a jugar
	
	public Jugador elegirTurno(Partida p) {
		Random r=new Random();
		System.out.println(p.getNumjugadores());
		int ale=r.nextInt(p.getNumjugadores());
		return p.getJugadores()[ale];
	}
	//TODO Metodo para comprobar respuesta
}

