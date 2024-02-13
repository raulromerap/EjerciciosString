package ejerciciosstring;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner lectura = new Scanner(System.in);
		
		String frase = "";
		
		char[] cadena;
		
		char[] resultado;
		
		String fraseInvertida = "";
		
		System.out.println("Introduce una frase");
		frase = lectura.nextLine();
		
		cadena = frase.toCharArray();
		
		resultado = cadenaInversa(cadena);
		
		fraseInvertida = frase.valueOf(resultado);
		
		System.out.println(resultado);
	}
	
	public static char[] cadenaInversa(char[] cadena) {
		
		char[] cadenaInversa = null;
		
		for(int i = cadena.length - 1; i >= 0; i++) {
			for(int j = 0; j < i; j++) {
				cadenaInversa[j] = cadena[i];
			}
		}
		
		return cadenaInversa;
	}

}
