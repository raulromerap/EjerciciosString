package ejerciciosstring;

import java.util.Scanner;

public class Ejercicio10 {

	private static final char[] CONJUNTO1 =
		{ 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };

	private static final char[] CONJUNTO2 =
		{ 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

	public static void main(String[] args) {

		Scanner lectura = new Scanner(System.in);
		
		char c;
		
		System.out.println("Introduce una letra");
		c = lectura.next().charAt(0);
		
	}

	public static char codifica(char[] CONJUNTO1, char[] CONJUNTO2, char c) {

		char caracterCodificado = c;

		return caracterCodificado;

	}
}
