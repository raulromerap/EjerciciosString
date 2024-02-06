package ejerciciosstring;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Se llama a la función Scanner para crear un objeto de este
		Scanner lectura = new Scanner(System.in);

		// Se crea una cadena para guardar la primera frase
		String primeraFrase = "";

		// Se crea una cadena para guardar la primera frase
		String segundaFrase = "";

		char[] letrasPF;

		char[] letrasSF;

		int cont1 = 0;

		int cont2 = 0;

		// Se imprime por pantalla un mensaje para que el usuario inserte la primera
		// frase
		System.out.println("Escribe la primera frase");
		// Se escanea y se guarda la cadena que ha insertado el usuario
		primeraFrase = lectura.nextLine();

		// Se imprime por pantalla un mensaje para que el usuario inserte la segunda
		// frase
		System.out.println("Escribe la segunda frase");
		// Se escanea y se guarda la cadena que ha insertado el usuario
		segundaFrase = lectura.nextLine();

		letrasPF = primeraFrase.toCharArray();

		letrasSF = segundaFrase.toCharArray();

		for (int i = 0; i < letrasPF.length; i++) {
			cont1++;
		}
		for (int i = 0; i < letrasSF.length; i++) {
			cont2++;
		}

		if (cont1 > cont2) {
			System.out.println("La primera frase es más grande que la segunda");
		} else {
			System.out.println("La segunda frase es más grande que la primera");
		}
		
		lectura.close();
	}

}
