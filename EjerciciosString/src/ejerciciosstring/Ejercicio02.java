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

		// Se crea una cadena la cual almacenará la contraseña del jugador 1
		String jugador1 = "";

		// Se crea una cadena la cual almacenará la contraseña del jugador 2
		String jugador2 = "";

		/*
		 * Este bucle imprime un mensaje para los jugadores introduzcan una contraseña,
		 * si el jugador 1, que es el que empieza, falla se le compara alfabeticamente
		 * con la contraseña y le imprime el mensaje al jugador 2 y así hasta que uno
		 * acierte, que se saldrá del bucle
		 */
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

		// Se añade una condición que, en caso de que gane el jugador 1 se le dará la
		// enhorabuena y en el caso que no salga ganador se le dará la enhorabuena al
		// jugador 2
		if (jugador1.equals(contraseña)) {
			System.out.println("El jugador 1 ha ganado, enhorabuena");
		} else {
			System.out.println("El jugador 2 ha ganado, enhorabuena");
		}
		lectura.close();
	}

}
