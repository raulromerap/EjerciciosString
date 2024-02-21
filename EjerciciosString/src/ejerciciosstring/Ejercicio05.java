package ejerciciosstring;

import java.util.Scanner;

/**
 * Esta clase te muestra la cadena que introduzcas del reves
 */
public class Ejercicio05 {

	/**
	 * Recoge la cadena introducida por el usuario y te muestra esta misma del reves
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se llama a la funcion Scanner
		Scanner lectura = new Scanner(System.in);

		// Se crea una variable para la frase
		String frase = "";

		// Se crea una variable para guardar el resultado
		String resultado = "";

		// Se imprime por pantalla un mensaje para que el usuario escriba la frase
		System.out.println("Introduce una frase");
		// Se escanea y se guarda la frase del usuario
		frase = lectura.nextLine();

		// Se iguala en la variable la cadena que devuelve la funcion
		resultado = cadenaInversa(frase);

		// Se imprime por pantalla la cadena invertida
		System.out.println(resultado);

		// Se cierra el escaner
		lectura.close();
	}

	/**
	 * Se encarga de ir desde el ultimo caracter de la cadena hasta el primero
	 * concatenando estos caracteres en la cadena que se retorna
	 * 
	 * @param frase La cadena introducida por el usuario
	 * @return Devuelve la cadena del usuario del reves
	 */
	public static String cadenaInversa(String frase) {

		// Se crea una variable para la frase invertida
		String fraseInversa = "";

		/*
		 * Se crea un bucle que construye la cadena invertida iniciando desde el ultimo
		 * caracter de la frase hasta la primera y se va sumando esos caracteres en la
		 * frase invertida
		 */
		for (int i = (frase.length() - 1); i >= 0; i--) {
			// Se concatenan los caracteres de la frase inicial en la posicion que se
			// encuentra en la cadena invertida
			fraseInversa += frase.charAt(i);
		}

		// Se devuelve la cadena invertida
		return fraseInversa;
	}

}
