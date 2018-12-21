package crud;

import java.util.Random;

import model.Actividades;

import datos.datosPreguntas;

public class CrudActividades {

	datosPreguntas dp0 = new datosPreguntas();

	// Método para mostrar una pregunta con sus respuestas
	public void imprimirPregunta(boolean opcion) {
		Random r = new Random();
		Actividades[] arrayP = dp0.obtenerPreguntas();
		Actividades[] arrayR = dp0.obtenerRetos();

		if (opcion == true) {
			int aleatoria = r.nextInt(arrayP.length - 1) + 1;
			System.out.println(arrayP[aleatoria].getEnunciado());
			System.out.println(arrayP[aleatoria].getRespuestas());
		} else if (opcion == false) {
			int aleatoria = r.nextInt(arrayR.length - 1) + 1;
			System.out.println(arrayR[aleatoria].getEnunciado());
			System.out.println(arrayR[aleatoria].getRespuestas());
		}
	}

}
