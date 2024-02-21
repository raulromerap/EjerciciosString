package ejerciciosstring;

import java.util.Scanner;

/**
 * Esta clase trata de un juego de adivinar la contraseña
 * 
 * @author raulromerap
 */
public class Ejercicio02 {

	/**
	 * Se encarga de pedirle a un primer usuario una contraseña, luego se le
	 * pregunta a un segundo para que lo adivine, si este falla se le da una pista
	 * de los caracteres que ha fallado y cuando gane se le da la enhorabuena
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se llama a la funcion Scanner
		Scanner lectura = new Scanner(System.in);

		// Se crea una cadena para la contraseña
		String contraseña = "";

		// Se crea una cadena para el intento del jugador
		String intento = "";

		// Se crea una cadena para el resultado del jugador que adivina
		String resultado = "";

		// Se muestra por pantalla un mensaje al jugador para que introduzca la
		// contraseña
		System.out.println("Escribe la contraseña");
		// Se escanea y se guarda la cadena
		contraseña = lectura.next();

		/*
		 * Se crea un bucle que repite los intentos del jugador que adivina hasta que su
		 * contraseña se igual a la del jugador 1
		 */
		do {

			// Se inicializa resultado a cadena vacia
			resultado = "";
			// Se imprime por pantalla un mensaje para que el usuario haga su intento
			System.out.println("Adivina la contraseña");
			// Se escanea y se guarda el intento
			intento = lectura.next();

			/*
			 * Se crea un bucle para volver a repetirle al usuario el mensaje de intento
			 * diciendo con esto de que la longitud de la contraseña es...
			 */
			while (contraseña.length() != intento.length()) {
				System.out.println("La longitud de la contraseña es " + contraseña.length());
				System.out.println("Vuelva a intentarlo");
				intento = lectura.next();
			}

			/*
			 * Se crea un bucle que lee los caracteres de las cadenas e identifican si son
			 * la misma, en caso de que no sean la misma se el muestra en el espacio de ese
			 * caracter un corchete
			 */
			for (int i = 0; i < intento.length(); i++) {
				if (contraseña.charAt(i) == intento.charAt(i)) {
					resultado += intento.charAt(i);
				} else {
					resultado += "*";
				}
			}
			// Se imprime la pista del resultado por pantalla
			System.out.println(resultado);

		} while (!contraseña.equals(resultado));

		// Se manda un mensaje de enhorabuena
		System.out.println("Enhorabuena!! Has acertado");

		// Se cierra el escaner
		lectura.close();

	}

}
