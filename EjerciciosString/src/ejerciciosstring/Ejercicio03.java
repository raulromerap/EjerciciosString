package ejerciciosstring;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner lectura = new Scanner(System.in);
		
		String cadena = "";
		
		int resultado;
		
		System.out.println("Introduce una cadena");
		cadena = lectura.nextLine();
		
		resultado = contadorEspacios(cadena);
		
		System.out.println("Hay " + resultado + " espacios");
		
		lectura.close();
	}
	
	public static int contadorEspacios(String cadena) {
		
		int cont = 0;
		
		char[] letras = cadena.toCharArray();
		
		for(char letra : letras) {
			if(letra == ' ') {
				cont++;
			}
		}
		
		return cont;
		
	}

}
