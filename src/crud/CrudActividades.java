package crud;

import java.util.Random;

import model.Actividades;
import model.Respuesta;
import datos.datosPreguntas;

public class CrudActividades {

	datosPreguntas dp0 = new datosPreguntas();
	
	//TODO COMPROBAR FUNCIONAMIENTO DE ESTE METODO
	// Método para mostrar una pregunta con sus respuestas
	public int imprimirPregunta(boolean opcion) {
		// Variables auxiliares
		int tam = 4;
		Random r = new Random();
		Actividades[] arrayPre = dp0.obtenerPreguntas();
		Actividades[] arrayRet = dp0.obtenerRetos();
		Respuesta[] res = new Respuesta[tam];
		Respuesta[] res2 = new Respuesta[tam];
		int aleatoria = r.nextInt(arrayPre.length - 1) + 1;
		res = arrayPre[aleatoria].getRespuestas();
		res2 = arrayRet[aleatoria].getRespuestas();

		if (opcion == true) {
			System.out.println(arrayPre[aleatoria].getEnunciado());
			for (int i = 0; i < res.length; i++) {
				System.out.printf("%d ", i + 1);
				System.out.println(res[i].getTexto());
			}

		} else if (opcion == false) {
			System.out.println(arrayRet[aleatoria].getEnunciado());
			for (int i = 0; i < res2.length; i++) {
				System.out.printf("%d ", i + 1);
				System.out.println(res2[i].getTexto());
			}
		}

		return aleatoria;
	}

}
