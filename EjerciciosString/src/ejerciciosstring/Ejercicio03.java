package ejerciciosstring;

import java.util.Scanner;

/**
 * Esta clase cuenta los espacios que hay de una cadena introducida por el
 * usuario
 * 
 * @author raulromerap
 */
public class Ejercicio03 {

	/**
	 * Se encarga de recoger la cadena del usuario y mostrarle por pantalla cuantos
	 * espacios hay
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se llama a la funcion Scanner
		Scanner lectura = new Scanner(System.in);

		// Se crea una cadena que guarda la frase que inserte el usuario
		String cadena = "";

		// Se crea una variable tipo entero para guardar el numero que nos devuelve el
		// contador de espacios
		int resultado;

		// Se imprime por pantalla un mensaje para que el usuario inserte la frase
		System.out.println("Introduce una cadena");
		// Se escanea y se guarda la cadena del usuario
		cadena = lectura.nextLine();

		// Se iguala la variable con el numero que devuelve la funcion
		resultado = contadorEspacios(cadena);

		// Se imprime un mensaje de cuantos espacios hay en la frase
		System.out.println("Hay " + resultado + " espacios");

		// Se cierra el escaner
		lectura.close();
	}

	/**
	 * Se encarga de recorrer la cadena caracter por caracter y devolver el numero
	 * de espacios que ha identificado
	 * 
	 * @param cadena La cadena introducida por el usuario
	 * @return Devuelve el numero espacios identificados
	 */
	public static int contadorEspacios(String cadena) {

		// Se crea un entero que funciona de contador de espacios
		int cont = 0;

		/*
		 * Se crea un bucle que recorre todas las letras de la cadena e incrementa el
		 * valor del contador cada vez que coincide con un espacio
		 */
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == ' ') {
				cont++;
			}
		}

		// Se devuelve el contador
		return cont;

	}

}
