package ejerciciosstring;

import java.util.Scanner;

/**
 * Esta clase se encarga de mostrarte cuantas veces se muestra la palabra que
 * buscas en la frase que has insertado
 * 
 * @author raulromerap
 */
public class Ejercicio07 {

	/**
	 * Se encarga de introducir una frase y una palabra, finalmente se muestra
	 * cuantas veces se encuentra la palabra en la frase
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se llama a la funcion Scanner
		Scanner lectura = new Scanner(System.in);

		// Se crea una cadena que guarda la frase del usuario
		String frase = "";

		// Se crea una cadena que guarda la palabra que quiere buscar el usuario
		String palabra = "";

		// Se crea una variable para el numero de veces que salga la palabra
		int resultado;

		// Se imprime por pantalla un mensaje para que el usuario inserte la frase que
		// desee
		System.out.println("Introduce una frase");
		// Se escanea y se guarda la cadena
		frase = lectura.nextLine();

		// Se imprime por pantalla un mensaje para que el usuario inserte la frase que
		// desee buscar en la frase
		System.out.println("Introduce una palabra");
		// Se escanea y se guarda la palabra
		palabra = lectura.next();

		// Se guarda el numero que devuelve la funcion
		resultado = cuentaPalabras(frase, palabra);

		// Se imprime el mensaje final con las veces que la palabra sale en la frase
		System.out.println("La palabra \"" + palabra + "\" se encuentra " + resultado + " veces");

		// Se cierra el escaner
		lectura.close();

	}

	/**
	 * Se encarga de separar la frase en un array para luego recorrerlo e
	 * identificar si la palabra está en el array
	 * 
	 * @param frase   La cadena larga que introduce el usuario
	 * @param palabra La palabra que introduce el usuario para buscar
	 * @return Se devuelve un entero con el numero de veces que se encuentra la
	 *         palabra
	 */
	public static int cuentaPalabras(String frase, String palabra) {

		// Se crea e inicializa un contador
		int cont = 0;

		// Se crea un array que guarda las palabras de la frase por espacios
		String[] palabras = frase.split(" ");

		/*
		 * Se crea un bucle que recorre el array y si la palabra está en el array se
		 * incrementa en uno el contador
		 */
		for (String valor : palabras) {
			if (valor.equals(palabra))
				cont++;
		}

		// Se devuelve el contador
		return cont;
	}

}
