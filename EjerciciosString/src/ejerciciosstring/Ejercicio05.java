package ejerciciosstring;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		Scanner lectura = new Scanner(System.in);
		
		String frase = "";
		
		char[] cadena;
		
		char[] resultado;
		
		System.out.println("Introduce una frase");
		frase = lectura.nextLine();
		
		cadena = frase.toCharArray();
		
		resultado = cadenaInversa(cadena);

		System.out.println(resultado);
		
		lectura.close();
	}
	
	public static char[] cadenaInversa(char[] cadena) {
		
		char[] cadenaInversa = new char[cadena.length];
		
		for(int i = 0; i < cadena.length; i++) {
				cadenaInversa[i] = cadena[(cadena.length-1) - i];
		}
		
		return cadenaInversa;
	}

}
