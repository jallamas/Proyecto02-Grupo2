package model;

import java.util.Arrays;

public class Partida {

	private int numjugadores, puntosVictoria, numMaxRondas;
	private double probabilidadComodin, probabilidadRobarComodin;
	private Jugador[] jugadores;
	private Actividades[] preguntas;
	private Actividades[] retos;

	public Partida(int numjugadores, int puntosVictoria, int numMaxRondas, double probabilidadComodin,
			double probabilidadRobarComodin, Jugador[] jugadores, Actividades[] preguntas, Actividades[] retos) {
		this.numjugadores = numjugadores;
		this.puntosVictoria = puntosVictoria;
		this.numMaxRondas = numMaxRondas;
		this.probabilidadComodin = probabilidadComodin;
		this.probabilidadRobarComodin = probabilidadRobarComodin;
		this.jugadores = jugadores;
		this.preguntas = preguntas;
		this.retos = retos;
	}

	public Partida() {
	}

	public int getNumjugadores() {
		return numjugadores;
	}

	public void setNumjugadores(int numjugadores) {
		this.numjugadores = numjugadores;
	}

	public int getPuntosVictoria() {
		return puntosVictoria;
	}

	public void setPuntosVictoria(int puntosVictoria) {
		this.puntosVictoria = puntosVictoria;
	}

	public int getNumMaxRondas() {
		return numMaxRondas;
	}

	public void setNumMaxRondas(int numMaxRondas) {
		this.numMaxRondas = numMaxRondas;
	}

	public double getProbabilidadComodin() {
		return probabilidadComodin;
	}

	public void setProbabilidadComodin(double probabilidadComodin) {
		this.probabilidadComodin = probabilidadComodin;
	}

	public double getProbabilidadRobarComodin() {
		return probabilidadRobarComodin;
	}

	public void setProbabilidadRobarComodin(double probabilidadRobarComodin) {
		this.probabilidadRobarComodin = probabilidadRobarComodin;
	}

	public Jugador[] getJugadores() {
		return jugadores;
	}

	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}

	public Actividades[] getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(Actividades[] preguntas) {
		this.preguntas = preguntas;
	}

	public Actividades[] getRetos() {
		return retos;
	}

	public void setRetos(Actividades[] retos) {
		this.retos = retos;
	}

	@Override
	public String toString() {
		return "Partida [numjugadores=" + numjugadores + ", puntosVictoria=" + puntosVictoria + ", numMaxRondas="
				+ numMaxRondas + ", probabilidadComodin=" + probabilidadComodin + ", probabilidadRobarComodin="
				+ probabilidadRobarComodin + ", jugadores=" + Arrays.toString(jugadores) + "]";
	}

}
