package ejerciciosstring;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String palabra = "";
		
		String anagrama = "";
		
		boolean resultado;
		
		System.out.println("Introduce una palabra");
		palabra = sc.next();
		
		System.out.println("Introduce el anagrama de la palabra anterior");
		anagrama = sc.next();
		
		
		sc.close();
	}

	public static boolean esAnagrama(String palabra, String anagrama) {
		
		boolean esAn = false;
		
		return esAn;
		
	}
	
}
