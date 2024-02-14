package ejerciciosstring;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		Scanner lectura = new Scanner(System.in);
		
		String frase = "";
		
		char[] palabras;
		
		System.out.println("Introduzca una frase que contenga la palabra fín donde quieras que acabe");
		frase = lectura.nextLine();
		
		palabras = frase.toCharArray();
		
		for(int i = 0; i < palabras.length; i++) {
			if(i == frase.lastIndexOf("fin")) {
				
			}
		}
		
	}

}
