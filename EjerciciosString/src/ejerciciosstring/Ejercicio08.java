package ejerciciosstring;

import java.util.Scanner;

/**
 * Esta clase muestra al usuario si su frase es palindroma o no
 * 
 * @author raulromerap
 */
public class Ejercicio08 {

	/**
	 * Pide al usuario que introduzca una cadena y le muestra si es palindroma o no
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se llama a la funcion Scanner
		Scanner lectura = new Scanner(System.in);

		// Frase a comprobar si es palíndroma o no
		String frase = "";

		// Se manda mensaje para que el usuario introduzca la frase
		System.out.println("Introduzca una frase");
		// Se escanea y guarda la cadena del usuario
		frase = lectura.nextLine();

		// Comprueba la función que comprueba si la palabra es palíndroma
		System.out.println(esPalindroma(frase) ? "Es palíndroma." : "No es palíndroma.");

		// Se cierra el escaner
		lectura.close();
	}

	/**
	 * Le da la vuelta a una frase para comprobar si es palíndroma o no
	 * 
	 * @param frase String que se comprobará
	 * @return Booleano que sirve de comprobante para saber si es palíndroma o no,
	 *         true si lo es false sino
	 */
	public static boolean esPalindroma(String frase) {
		// Se crea una cadena para guardar la frase sin espacios
		String fraseSinEspacios;
		// Se crea una cadena para guardar la frases del reves
		String fraseReves = "";
		// Se crea una booleana para saber si la frase es palindroma o no
		boolean esPalindroma = false;

		// Primero le quitamos los espacios a la frase
		fraseSinEspacios = frase.replace(" ", "");
		// Recorre la frase para montar la frase del reves
		for (int i = fraseSinEspacios.length() - 1; i >= 0; i--) {
			fraseReves += fraseSinEspacios.charAt(i);
		}

		// Comprueba que las dos frases sean iguales
		if (fraseReves.equalsIgnoreCase(fraseSinEspacios)) {
			esPalindroma = true;
		}

		// Se devuelve el booleano
		return esPalindroma;
	}
}
