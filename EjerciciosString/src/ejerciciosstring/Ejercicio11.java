package ejerciciosstring;

import java.util.Scanner;

public class Ejercicio11 {

	private static final char[] CONJUNTO1 = 
		{ 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };

	private static final char[] CONJUNTO2 = 
		{ 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

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

		char cDesodificado = ' ';

		for(int i = 0; i < CONJUNTO2.length; i++) {
			if(c == CONJUNTO2[i]) {
				cDesodificado = CONJUNTO1[i];
				break;
			}else {
				cDesodificado = c;
			}
		}
		
		return cDesodificado;

	}
}
