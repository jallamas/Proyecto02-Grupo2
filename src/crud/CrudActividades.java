package crud;
import java.util.Random;

import model.Actividades;

public class CrudActividades {

	// Método para mostrar una pregunta con sus respuestas
	
	public void imprimirPregunta(Actividades[] a) {
		Random r = new Random();
		int preguntaAleatoria = r.nextInt(a.length-1+1)-1;
		System.out.println(a[preguntaAleatoria].getEnunciado());
		System.out.println(a[preguntaAleatoria].getRespuestas());
	}
}
