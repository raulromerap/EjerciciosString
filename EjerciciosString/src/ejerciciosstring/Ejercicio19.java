package ejerciciosstring;

/**
 * Esta clase se encarga de pasar a notacion camel la frase que introduzcamos
 * 
 * @author raulromerap
 */
public class Ejercicio19 {

	/**
	 * Se encarga de recoger la frase y de mostrarla ya en notacion camel
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Se crea e inicializa una cadena
		String cadena = "	PrUeba CaMEL casE ";
		// Se imprime por pantalla la cadena en camel
		System.out.println(camelCase(cadena));
	}

	/**
	 * Se recoge la cadena de main, se pasa a minuscula, se quita los espacios
	 * innecesarios y se separa en una tabla, se van juntando los caracteres, y en
	 * el caso de que sea la primera letra de la palabra, excepto la primera
	 * palabra, se pone en mayuscula
	 * 
	 * @param cadena La frase introducida por el usuario
	 * @return Devuelve una cadena ya en notacion camel
	 */
	public static String camelCase(String cadena) {
		// Se crea una cadena para la frase en camel
		String cadCamel = "";

		// Se crea una tabla que separa las palabras de la frase
		String[] cadArray = cadena.trim().toLowerCase().split(" ");

		// Se añade la primera palabra de la frase
		cadCamel += cadArray[0];

		/*
		 * Se crea un bucle que recorre toda la tabla y añade los caracteres de las
		 * palabras en orden, poniendo la primera en mayusculas
		 */
		for (int i = 1; i < cadArray.length; i++) {

			cadCamel += Character.toUpperCase(cadArray[i].charAt(0)) + cadArray[i].substring(1);
		}

		// Se devuelve la cadena en notacion camel
		return cadCamel;
	}

}
