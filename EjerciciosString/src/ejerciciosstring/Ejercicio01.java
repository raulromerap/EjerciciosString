package ejerciciosstring;

import java.util.Scanner;

/**
 * Esta clase muestra cual de las dos frases del usuario es mas corta
 * 
 * @author raulromerap
 */
public class Ejercicio01 {

	/**
	 * El usuario escribe dos frases, se calculan sus longitudes y manda un mensaje
	 * de cual es mas corta
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se llama a la función Scanner para crear un objeto de este
		Scanner lectura = new Scanner(System.in);

		// Se crea una cadena para guardar la primera frase
		String primeraFrase = "";

		// Se crea una cadena para guardar la primera frase
		String segundaFrase = "";

		// Se imprime por pantalla un mensaje para que el usuario inserte la primera
		// frase
		System.out.println("Escribe la primera frase");
		// Se escanea y se guarda la cadena que ha insertado el usuario
		primeraFrase = lectura.nextLine();

		// Se imprime por pantalla un mensaje para que el usuario inserte la segunda
		// frase
		System.out.println("Escribe la segunda frase");
		// Se escanea y se guarda la cadena que ha insertado el usuario
		segundaFrase = lectura.nextLine();

		// Si la primera frase es mas larga que la segunda se imprime por pantalla
		// mensaje
		if (primeraFrase.length() > segundaFrase.length()) {
			System.out.println("La segunda frase es más corta que la primera");
		} else {
			System.out.println("La primera frase es más corta que la segunda");
		}

		// Se cierra el escaner
		lectura.close();
	}

}
