package utilidades;

import java.util.Random;

public class Probabilidad {

	
	//Metodo generarprobabilidad
	//Este metodo genera una probabilidad sobre un numero
	public static int generarProbabilidad(int max, int num, float ratio) {
		// Variable local
		Random r = new Random();
		float x;
		int aleatorio = r.nextInt(max) + 1;
		x = max * ratio;
		if (aleatorio <= x) {

			return num;
		} else {
			do {
				aleatorio = r.nextInt(max) + 1;
			} while (aleatorio == num);
			return aleatorio;
		}
	}
}

/*NOTA*/
//Con esto podeis probar el metodo arriba mencionado
//int max = 2;
//int num = 2;
//float ratio = 100.0F; 100.0 es el 100%, 0.75 es el 75%
//int valor = Probabilidad.generarProbabilidad(max, num, ratio);

//System.out.println("Rango: [desde 1 hasta " + max + "]");
//System.out.println("Numero: " + num);
//System.out.println("% de Ratio: " + ratio);      
//System.out.println("Valor: " + valor);
