package ejerciciosstring;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Esta clase se encarga de mostrar al usuario cual es la palabra mas larga de
 * la frase que introduce y las letras de este
 * 
 * @author raulromerap
 */
public class Ejercicio12 {

	/**
	 * Este metodo se encarga de recoger una frase introducida por el usuario y,
	 * haciendo uso de un array de cadenas, identificar cual es la mas larga de
	 * todas y luego la muestra junto a sus letras
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se llama a la funcion Scanner
		Scanner lectura = new Scanner(System.in);

		// Se crea una cadena que guarda la frase del usuario
		String frase = "";

		// Se crea una tabla para guardar las palabras de la cadena
		String[] palabras;

		// Se crea una cadena para guardar la palabra mas larga
		String palabraLarga = "";

		// Se crea una tabla que guarda las letras de la palabra larga
		char[] letras;

		// Se introduce un mensaje para que el usuario introduzca la frase
		System.out.println("Introduce una frase");
		// Se escanea y se guarda la cadena del usuario
		frase = lectura.nextLine();

		// Se separa las palabras en el array por espacios
		palabras = frase.split(" ");

		// Se deja la primera palabra como la mas larga
		palabraLarga = palabras[0];

		/*
		 * Este bucle se encarga de recorrer la tabla de palabras y compara si la que se
		 * identifica ahora como la palabra larga es mas corta o larga que otra de la
		 * tabla, si es mas corta se guarda la nueva como la larga
		 */
		for (int i = 0; i < palabras.length; i++) {
			if (palabraLarga.length() < palabras[i].length()) {
				palabraLarga = palabras[i];
			}
		}

		// Se separa por caracteres la palabra larga en el array
		letras = palabraLarga.toCharArray();

		// Se imprime por pantalla la palabra larga
		System.out.println(palabraLarga);
		// Se imprime por pantalla la tabla con las letras
		System.out.println(Arrays.toString(letras));

		// Se cierra el escaner
		lectura.close();

	}

}
