package ejerciciosstring;

import java.util.Scanner;

/**
 * Esta clase se encarga de mostrar el codigo html necesario para empezar tu
 * pagina web
 */
public class Ejercicio18 {

	/**
	 * Se encarga de recoger las cadenas del encabezado y el contenido de la pagina
	 * y devuelve el codigo html
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Se llama a la funcion Scanner
		Scanner lectura = new Scanner(System.in);

		// Se crea una cadena para el encabezado
		String encabezado = "";

		// Se crea una cadena para el contenido
		String contenido = "";

		// Se crea una cadena que guarda lo devuelto del metodo del codigo
		String salida = "";

		// Se muestra un mensaje para que añada el titulo
		System.out.println("Escriba el titulo de la pagina web");
		encabezado = lectura.nextLine();

		System.out.println("Escriba el contenido de la pagina web");
		contenido = lectura.nextLine();

		salida = codigoHTML(encabezado, contenido);

		System.out.println(salida);

		lectura.close();
	}

	/**
	 * Se encarga de crear una cadena con el codigo html con el encabezado y el
	 * contenido añadido
	 * 
	 * @param encabezado La cadena para el titulo de la pagina
	 * @param contenido  La cadena para el contenido de la pagina
	 * @return Devuelve la cadena del codigo
	 */
	public static String codigoHTML(String encabezado, String contenido) {

		String codigo = "";

		codigo = "<html>\n\t<head>\n\t\t<title>" + encabezado + "</title>\n\t</head>\n\t<body>\n\t\t<h1>" + encabezado
				+ "</h1>\n\t\t<p>" + contenido + "</p>\n\t</body>\n</html>";

		return codigo;

	}

}
