package ejerciciosstring;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		Scanner lectura = new Scanner(System.in);
		
		String cadena = "";
		
		System.out.println("Introduzca una frase");
		cadena = lectura.nextLine();
		
		String[] palabras = cadena.split(" ");
		
		Arrays.sort(palabras);
		
		System.out.println(Arrays.toString(palabras));
		
		lectura.close();
		
	}

}
