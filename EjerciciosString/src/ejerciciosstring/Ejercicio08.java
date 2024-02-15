package ejerciciosstring;

import java.util.Scanner;

/**
 * Esta clase pertenece a la actividad 8 de los ejercicios 4.2
 * 
 * @author raulromerap
 */
public class Ejercicio08 {

	/**
	 * Esta funcion se encarga de escanear la frase del usuario y luego mostrar si
	 * la frase es palindroma
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se llama a la funcion Scanner
		Scanner lectura = new Scanner(System.in);

		// Se crea una variable para guardar la cadena del usuario
		String frase = "";

		// Se crea una variable para guardar el valor booleano que devuelve la funcion
		boolean resultado;

		// Se imprime por pantalla un mensaje para que el usuario introduzca la frase
		System.out.println("Introduzca una frase");
		// Se escanea y guarda la cadena que ha insertado el usuario
		frase = lectura.nextLine();

		// Se pasa los caracteres de la cadena a minusculas
		frase = frase.toLowerCase();

		// Se iguala el retorno en la variable
		resultado = frasePalindroma(frase);

		/*
		 * Se añade una condicion para que en el caso de que el booleano sea true se
		 * devuelve el mensaje de que la frase es palindroma, en caso contrario se manda
		 * que no es palindroma
		 */
		if (resultado) {
			System.out.println("La frase es palíndroma");
		} else {
			System.out.println("La frase no es palíndroma");
		}

		// Se cierra el escaner
		lectura.close();
	}

	/**
	 * Esta funcion se encarga de remplazar los espacios por espacios vacios y
	 * verificar si las letras coinciden en su orden, es decir, en modo espejo
	 * 
	 * @param frase La frase del usuario (en minuscula) que se escanea en main
	 * @return Devuelve un booleano que si es true indica que la frase es palindroma
	 *         y si es false no
	 */
	public static boolean frasePalindroma(String frase) {

		// Se crea una variable booleana que se inicializa en false
		boolean esPalindroma = false;

		// Se crea e inicializa una cadena que remplaza los espacios de la cadena que
		// recibe por parametro a espacios vacios
		String fraseSinEspacios = frase.replace(" ", "");

		// Se crea un array que guarda los caracteres de la cadena sin espacios
		char[] letrasSE = fraseSinEspacios.toCharArray();

		/*
		 * Se crea un bucle que recorre la tabla del indice cero hasta el final, para
		 * saber si la frase es palindroma debe verificar y el caracter del indice donde
		 * se encuentra es igual a la posicion inversa (limite mayor de la tabla menos
		 * posicion), si se cumple la condicion se iguala el booleano a true, sino a
		 * false
		 */
		for (int i = 0; i < letrasSE.length; i++) {
			if (letrasSE[i] == letrasSE[(letrasSE.length - 1) - i]) {
				esPalindroma = true;
			} else {
				esPalindroma = false;
			}
		}

		// Se devuelve la variable booleana
		return esPalindroma;
	}
}
