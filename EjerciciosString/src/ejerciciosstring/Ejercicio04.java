package ejerciciosstring;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Esta clase te deja observar las palabras alfabeticamente ordenadas de una
 * cadena que introduzcas
 * 
 * @author raulromerap
 */
public class Ejercicio04 {

	/**
	 * Se encarga de recoger la cadena introducida por el usuario, separar las
	 * palabras por espacios, luego los ordena alfabeticamente y te muestra el array
	 * ordenado
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se llama a la funcion Scanner
		Scanner lectura = new Scanner(System.in);

		// Se crea e inicializa la cadena
		String cadena = "";

		// Se crea un array de string
		String[] palabras;

		// Se imprime por pantalla un mensaje para que el usuario inserte la frase
		System.out.println("Introduzca una frase");
		// Se escanea y se guarda la cadena en la variable
		cadena = lectura.nextLine();

		// Se guardan la palabras quitando los espacios en el array
		palabras = cadena.split(" ");

		// Se ordenan alfabeticamente las palabras
		Arrays.sort(palabras);

		// Se imprime el array por consola
		System.out.println(Arrays.toString(palabras));

		// Se cierra el escaner
		lectura.close();

	}

}
