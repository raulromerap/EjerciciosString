package ejerciciosstring;

import java.util.Arrays;

/**
 * Esta clase se encarga de mostrar en un tabla la frase separada por el tamaño
 * de caracteres que tu elijas
 * 
 * @author raulromerap
 */
public class Ejercicio20 {

	/**
	 * Este metodo se encarga de recoger la frase y el numero de division, luego
	 * muestra la tabla con la separacion
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String frase = "Por el monte va una cabra volando";
		int numero = 4;

		System.out.println(Arrays.toString(dividePalabra(frase, numero)));
	}

	/**
	 * Este metodo se encarga de crear una tabla con el tamaño adecuado para la
	 * separacion y divide la frase para que todos tenga la misma longitud de
	 * separacion, aunque en ocasiones, la ultima separacion no tiene el tamaño que
	 * pedimos
	 * 
	 * @param frase La frase que inserta el usuario
	 * @param numCaracteres El numero de caracteres que quiere que separe
	 * @return Se devuelve una tabla con cadenas de la frase separada
	 */
	public static String[] dividePalabra(String frase, int numCaracteres) {

		int tam = (int) Math.ceil((double) frase.length() / numCaracteres);
		String[] arrayPalabras = new String[tam];

		for (int i = 0; i < arrayPalabras.length; i++) {
			if (numCaracteres * (i + 1) > frase.length()) {
				arrayPalabras[i] = frase.substring(numCaracteres * i);
			} else {
				arrayPalabras[i] = frase.substring(numCaracteres * i, numCaracteres * (i + 1));
			}
		}

		return arrayPalabras;
	}

}
