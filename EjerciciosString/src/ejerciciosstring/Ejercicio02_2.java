package ejerciciosstring;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02_2 {

	public static void main(String[] args) {

		Scanner lectura = new Scanner(System.in);

		String contraseña = "odiobd001";

		String jugador1 = "";

		String jugador2 = "";

		char[] letras1;

		char[] letras2;

		char[] letrasC = contraseña.toCharArray();

		char[] comparacion = contraseña.toCharArray();

		do {

			System.out.println("Jugador 1 - Adivina la contraseña");
			jugador1 = lectura.nextLine();
			letras1 = jugador1.toCharArray();

			if (jugador1.length() == contraseña.length()) {
				for (int i = 0; i < letrasC.length; i++) {
					for (int j = i; j < letras1[i]; j++) {
						if (letrasC[i] == letras1[i]) {
							comparacion[i] = letrasC[i];
						} else {
							comparacion[i] = '*';
						}
					}
				}
			} else if (jugador1.length() > contraseña.length()) {
				System.out.println("La contraseña es más corta");
			} else {
				System.out.println("La contraseña es más larga");
			}

			if (!jugador1.equals(contraseña) && jugador1.length() == contraseña.length()) {
				System.out.println(Arrays.toString(comparacion));
			} else if (jugador1.equals(contraseña)) {
				break;
			}

			System.out.println("Jugador 2 - Adivina la contraseña");
			jugador2 = lectura.nextLine();
			letras2 = jugador2.toCharArray();

			if (jugador2.length() == contraseña.length()) {
				for (int i = 0; i < letrasC.length; i++) {
					for (int j = i; j < letras2[i]; j++) {
						if (letrasC[i] == letras2[i]) {
							comparacion[i] = letrasC[i];
						} else {
							comparacion[i] = '*';
						}
					}
				}
			} else if (jugador2.length() > contraseña.length()) {
				System.out.println("La contraseña es más corta");
			} else {
				System.out.println("La contraseña es más larga");
			}

			if (!jugador2.equals(contraseña) && jugador2.length() == contraseña.length()) {
				System.out.println(Arrays.toString(comparacion));
			} else if (jugador2.equals(contraseña)) {
				break;
			}

		} while (!jugador1.equals(contraseña) || !jugador2.equals(contraseña));

		// Se añade una condición que, en caso de que gane el jugador 1 se le dará la
		// enhorabuena y en el caso que no salga ganador se le dará la enhorabuena al
		// jugador 2
		if (jugador1.equals(contraseña)) {
			System.out.println("El jugador 1 ha ganado, enhorabuena!");
		} else {
			System.out.println("El jugador 2 ha ganado, enhorabuena!");
		}

		lectura.close();
	}

}
