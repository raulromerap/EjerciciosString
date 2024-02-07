package ejerciciosstring;

import java.util.Scanner;

/**
 * Esta clase pertenece al ejercicio 2 del tema 4.2 "String"
 */
public class Ejercicio02 {

	/**
	 * Esta funcion se encarga de crear una contraseña, se le muestra a los
	 * jugadores un mensaje para que adivinen la contraseña, si lo que escribe el
	 * jugador 1 no es la contraseña se pasa al jugador 2 el turno, si cualquiera de
	 * los dos acierta se corta el bucle y muestra quien a sido el ganador
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se llama a la función Scanner para crear un objeto de esta
		Scanner lectura = new Scanner(System.in);

		// Se crea una cadena que contiene la contraseña
		String contraseña = "odiobd001";

		String jugador1 = "";

		String jugador2 = "";

		do {

			System.out.println("Jugador 1 - Adivina la contraseña");
			jugador1 = lectura.nextLine();

			if (!jugador1.equals(contraseña)) {
				System.out.println(jugador1.compareTo(contraseña));
			} else if (jugador1.equals(contraseña)) {
				break;
			}

			System.out.println("Jugador 2 - Adivina la contraseña");
			jugador2 = lectura.nextLine();

			if (!jugador2.equals(contraseña)) {
				System.out.println(jugador2.compareTo(contraseña));
			} else if (jugador1.equals(contraseña)) {
				break;
			}

		} while (!jugador1.equals(contraseña) || !jugador2.equals(contraseña));

		if (jugador1.equals(contraseña)) {
			System.out.println("El jugador 1 ha ganado");
		} else {
			System.out.println("El jugador 2 ha ganado");
		}
	}

}
