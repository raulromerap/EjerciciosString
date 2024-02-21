package ejerciciosstring;

import java.util.Scanner;

/**
 * Esta clase te deja introducir muchas palabras y para cuando escribes "fin",
 * despues de eso te muestra la cadena de palabras
 */
public class Ejercicio06 {

	/**
	 * Se encarga de recoger las palabras del usuario, mientras el usuario sigue
	 * introduciendo palabras estas se van concatenando en una cadena, cuando el
	 * usuario inserte la palabra fin se acaba el bucle y se muestra por pantalla la
	 * cadena formada por estas palabras
	 * 
	 * @param args
	 */
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
