package crud;

import java.util.Random;

import model.Actividades;
import model.Jugador;
import model.Respuesta;
import datos.DatosPreguntas;
import controller.ControllerPartida;

public class CrudActividades {

	DatosPreguntas dp0 = new DatosPreguntas();

	/*IMPRIMIR PREGUNTA CON SUS CORRESPONDIENTES RESPUESTAS*/
	public int imprimirPregunta(boolean opcion) {
		// Variables auxiliares
		int tam = 4;
		Random r = new Random();
		Actividades[] arrayPre = dp0.obtenerPreguntas();
		Actividades[] arrayRet = dp0.obtenerRetos();
		Respuesta[] res = new Respuesta[tam];
		Respuesta[] res2 = new Respuesta[tam];
		int aleatoriaP = r.nextInt(arrayPre.length - 1) + 1;
		int aleatoriaRet = r.nextInt(arrayRet.length - 1) + 1;
		res = arrayPre[aleatoriaP].getRespuestas();
		res2 = arrayRet[aleatoriaRet].getRespuestas();

		if (opcion == true) {
			System.out.println(arrayPre[aleatoriaP].getEnunciado());
			for (int i = 0; i < res.length; i++) {
				System.out.printf("%d. ", i + 1);
				System.out.println(res[i].getTexto());
			}

		} else if (opcion == false) {
			System.out.println(arrayRet[aleatoriaRet].getEnunciado());
			for (int i = 0; i < res2.length; i++) {
				System.out.printf("%d. ", i + 1);
				System.out.println(res2[i].getTexto());
			}
		}
		if (opcion == true) {
			return aleatoriaP;
		} else
			return aleatoriaRet;

	}

	/*COMPROBAR LA RESPUESTA CORRECTA*/
	public void comprobarRespuesta(int opcion, int aleatorio, boolean elegir, Jugador j1, Jugador[] listajug,
			int probcomodin, int probrobar) {
		// Variables auxiliares
		int uno = 1;
		ControllerPartida controlp = new ControllerPartida();
		Actividades[] arrayPre = dp0.obtenerPreguntas();
		Actividades[] arrayRet = dp0.obtenerRetos();

		if (elegir == true) {
			if (arrayPre[aleatorio].getRespuestas()[opcion - 1].getVerdaderoFalso() == true) { // PREGUNTAS
				j1.setPuntuacion(j1.getPuntuacion() + uno);

				System.out.println("Respuesta correcta");
				controlp.generarEvento(j1, listajug, probcomodin, probrobar);
			} else if (arrayPre[aleatorio].getRespuestas()[opcion - 1].getVerdaderoFalso() == false) {
				System.out.println("Respuesta incorrecta");
			}
		} else if (elegir == false) { // RETOS
			if (arrayRet[aleatorio].getRespuestas()[opcion - 1].getVerdaderoFalso() == true) {
				j1.setPuntuacion(j1.getPuntuacion() + uno);
				System.out.println("Respuesta correcta");
				controlp.generarEvento(j1, listajug, probcomodin, probrobar);
			} else if (arrayRet[aleatorio].getRespuestas()[opcion - 1].getVerdaderoFalso() == false) {
				System.out.println("Respuesta incorrecta");
			}
		}
	}

	/*IMPRIMIR PREGUNTA EN EL CASO DE QUE NO SE DISPONGA DE UN COMODÍN.*/
	public int imprimirPreguntaSinComodin(boolean opcion, int numeropregunta) {
		// Variables auxiliares
		int tam = 4;

		Actividades[] arrayPre = dp0.obtenerPreguntas();
		Actividades[] arrayRet = dp0.obtenerRetos();
		Respuesta[] res = new Respuesta[tam];
		Respuesta[] res2 = new Respuesta[tam];
		int aleatoriaP = numeropregunta;
		int aleatoriaRet = numeropregunta;
		res = arrayPre[numeropregunta].getRespuestas();
		res2 = arrayRet[numeropregunta].getRespuestas();

		if (opcion == true) {
			System.out.println(arrayPre[aleatoriaP].getEnunciado());
			for (int i = 0; i < res.length; i++) {
				System.out.printf("%d. ", i + 1);
				System.out.println(res[i].getTexto());
			}

		} else if (opcion == false) {
			System.out.println(arrayRet[aleatoriaRet].getEnunciado());
			for (int i = 0; i < res2.length; i++) {
				System.out.printf("%d. ", i + 1);
				System.out.println(res2[i].getTexto());
			}
		}
		if (opcion == true) {
			return aleatoriaP;
		} else
			return aleatoriaRet;

	}

}
