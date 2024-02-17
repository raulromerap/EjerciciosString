package ejerciciosstring;

import java.util.Scanner;

public class Ejercicio14 {

	private static final char[] abecedario = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o',
			'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	public static void main(String[] args) {

		Scanner lectura = new Scanner(System.in);

		String frase = "";

		int cont = 0;

		char[] letras;

		System.out.println("Introduzca una frase");
		frase = lectura.nextLine();

		frase = frase.toLowerCase();

		letras = frase.toCharArray();

		for (int i = 0; i < abecedario.length; i++) {
			cont = 0;
			for (int j = 0; j < letras.length; j++) {
				if(abecedario[i] == letras[j]) {
					cont++;
				}
			}
			
			if(cont==0) {
				System.out.print("");
			}else {
				System.out.println(abecedario[i] + ": " + cont + " veces");
			}
		}
		
		lectura.close();
	}

}
