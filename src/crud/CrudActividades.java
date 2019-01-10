package crud;

import java.util.Random;

import model.Actividades;
import model.Jugador;
import model.Respuesta;
import datos.datosPreguntas;

public class CrudActividades {

	datosPreguntas dp0 = new datosPreguntas();

	// TODO COMPROBAR FUNCIONAMIENTO DE ESTE METODO
	// Método para mostrar una pregunta con sus respuestas
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

	public void comprobarRespuesta(int opcion, boolean elegir, Jugador j1) {
		// Variables auxiliares
		int nuevaPuntuacion;
		int uno = 1;
		Respuesta[] aux;
		Respuesta[] aux2;
		Actividades[] arrayPre = dp0.obtenerPreguntas();
		Actividades[] arrayRet = dp0.obtenerRetos();
		aux = arrayPre[opcion - 1].getRespuestas();
		aux2 = arrayRet[opcion - 1].getRespuestas();

		if (elegir == true) {
			if (aux[opcion - 1].getVerdaderoFalso() == true) { // PREGUNTAS
				nuevaPuntuacion = j1.getPuntuacion() + uno;
				j1.setPuntuacion(nuevaPuntuacion);
				System.out.println("Respuesta correcta");
			} else if (aux[opcion - 1].getVerdaderoFalso() == false) {
				System.out.println("Respuesta incorrecta");
			}
		} else if (elegir == false) { // RETOS
			if (aux2[opcion - 1].getVerdaderoFalso() == true) {
				nuevaPuntuacion = j1.getPuntuacion() + uno;
				j1.setPuntuacion(nuevaPuntuacion);
				System.out.println("Respuesta correcta");

			} else if (aux[opcion - 1].getVerdaderoFalso() == false) {
				System.out.println("Respuesta incorrecta");
			}
		}
	}
}
