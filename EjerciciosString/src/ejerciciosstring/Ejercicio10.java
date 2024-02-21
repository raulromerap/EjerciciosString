package ejerciciosstring;

import java.util.Scanner;

/**
 * Esta clase se encarga de codificar una palabra que le insertes
 * 
 * @author raulromerap
 */
public class Ejercicio10 {

	/**
	 * Atributo que guarda una tabla con los caracteres que se cogeran de la palabra
	 */
	public static final char[] CONJUNTO1 = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };

	/**
	 * Atributo que guarda una tabla con los caracteres que cambian a los del
	 * conjunto 1
	 */
	public static final char[] CONJUNTO2 = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

	/**
	 * Se encarga de recoger una palabra y manda a otra funcion las letras
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner lectura = new Scanner(System.in);

		String frase = "";

		String aux = "";

		String fraseCodificada = "";

		char c;

		int i = 0;

		System.out.println("Introduce una palabra");
		frase = lectura.next();

		aux = frase.toLowerCase();

		while (i != frase.length()) {

			c = aux.charAt(i);

			fraseCodificada += codifica(CONJUNTO1, CONJUNTO2, c);

			i++;
		}

		System.out.println(fraseCodificada);

		lectura.close();
	}

	public static char codifica(char[] CONJUNTO1, char[] CONJUNTO2, char c) {

		char cCodificado = ' ';

		for (int i = 0; i < CONJUNTO1.length; i++) {
			if (c == CONJUNTO1[i]) {
				cCodificado = CONJUNTO2[i];
				break;
			} else {
				cCodificado = c;
			}
		}

		return cCodificado;

	}
}
