package ejerciciosstring;

import java.util.Scanner;

/**
 * Esta clase se encarga de traducir una frase de javalandia al dialecto normal
 * 
 * @author raulromerap
 */
public class Ejercicio09 {

	/**
	 * Atributo que guarda el comienzo de la frase de javalandia
	 */
	public static final String COMIENZO = "Javalín, javalón";

	/**
	 * Atributo que guarda la finalizacion de la frase de javalandia
	 */
	public static final String FINALIZACION = "javalén, lén, lén";

	/**
	 * Se encarga de recoger la frase del usuario en leguaje de javalandia y le
	 * remplaza, el comienzo o el final, segun que haya introducido, por un caracter
	 * vacio, y finalmente se le muestra al usuario la traduccion
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se llama a la funcion Scanner
		Scanner lectura = new Scanner(System.in);

		// Se crea la cadena guarda la frase javalandia
		String fraseJavalandia = "";

		// Se crea la cadena que guarda la frase ya traducida
		String fraseTraducida = "";

		// Se imprime por pantalla un mensaje para que el usuario introduzca la frase
		System.out.println("Introduce la frase");
		// Se escanea y se guarda la frase
		fraseJavalandia = lectura.nextLine();

		// Si se trata del comienzo se remplaza por espacio vacio la parte de la frase
		if (fraseJavalandia.startsWith(COMIENZO)) {

			fraseTraducida = fraseJavalandia.replace(COMIENZO, "");

		} 
		// Lo mismo con el final
		else if (fraseJavalandia.endsWith(FINALIZACION)) {

			fraseTraducida = fraseJavalandia.replace(FINALIZACION, "");

		} 
		// Si la frase no esta en lenguaje de javalandia se pone igual
		else {
			fraseTraducida = fraseJavalandia;
		}

		// Se le quitan los espacios del principio y el final de la cadena
		fraseTraducida = fraseTraducida.trim();

		// Se muestra la frase ya traducida
		System.out.println(fraseTraducida);

		// Se cierra el escaner
		lectura.close();
	}

}
