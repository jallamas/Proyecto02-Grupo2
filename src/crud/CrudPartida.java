package crud;

import model.Jugador;
import model.Partida;

public class CrudPartida {
	
	public Partida crearPartida(int numJug, int ptosVict, double probabilidadComodin,double probabilidadRobarComodin, Jugador[] jugadores) {
		int maxRondas=0;
		Partida p;
			if (ptosVict<=20) {
				maxRondas=ptosVict + 2;
			}else if(ptosVict>20){
				maxRondas=ptosVict+(ptosVict*20/100);
			}
		p= new Partida(numJug,ptosVict,maxRondas, probabilidadComodin, probabilidadRobarComodin, jugadores);
	return p;
	}
	
}