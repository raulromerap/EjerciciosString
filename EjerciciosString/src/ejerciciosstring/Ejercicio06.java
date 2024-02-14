package ejerciciosstring;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		// Se llama a la funcion Scanner
		Scanner lectura = new Scanner(System.in);

		// Se crea una variable que guarda la palabra que inserte el usuario
		String palabra = "";

		// Se crea una variable que guarda la frase
		String frase = "";

		// Se imprime por pantalla el mensaje para que el usuario introduzca la palabra
		System.out.println("Introduzca una palabra");
		// Se escanea y guarda la palabra del usuario
		palabra = lectura.next();
		
		/*
		 * Se crea un bucle que pide al usuario que inserte una palabra y se guarda en
		 * forma de frase, el bucle seguirá hasta que el usuario ponga la palabra "fin"
		 */
		while (!palabra.equalsIgnoreCase("fin")) {
			
			lectura.nextLine();

			// Se concatenan las palabras en la variable "frase"
			frase += palabra + " ";

			// Se imprime por pantalla el mensaje para que el usuario introduzca la palabra
			System.out.println("Introduzca una palabra");
			// Se escanea y guarda la palabra del usuario
			palabra = lectura.next();

		}

		// Se imprime por pantalla la frase
		System.out.println(frase);

		// Se cierra el escaner
		lectura.close();
	}

}
