package ejerciciosstring;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		Scanner lectura = new Scanner(System.in);

		String frase = "";

		String palabra = "";

		int resultado;

		System.out.println("Introduce una frase");
		frase = lectura.nextLine();

		System.out.println("Introduce una palabra");
		palabra = lectura.next();

		resultado = cuentaPalabras(frase, palabra);

		System.out.println("La palabra \"" + palabra + "\" se encuentra " + resultado + " veces");

		lectura.close();

	}

	public static int cuentaPalabras(String frase, String palabra) {

		int cont = 0;

		String[] palabras = frase.split(" ");

		for (String valor : palabras) {
			if (valor.equals(palabra))
				cont++;
		}

		return cont;
	}

}
