package ejerciciosstring;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {

		Scanner lectura = new Scanner(System.in);

		String encabezado = "";

		String contenido = "";

		String salida = "";

		System.out.println("Escriba el titulo de la pagina web");
		encabezado = lectura.nextLine();

		System.out.println("Escriba el contenido de la pagina web");
		contenido = lectura.nextLine();

		salida = codigoHTML(encabezado, contenido);

		System.out.println(salida);

		lectura.close();
	}

	public static String codigoHTML(String encabezado, String contenido) {

		String codigo = "";

		codigo = "<html>\n\t<head>\n\t\t<title>" + encabezado + "</title>\n\t</head>\n\t<body>\n\t\t<h1>" + encabezado
				+ "</h1>\n\t\t<p>" + contenido + "</p>\n\t</body>\n</html>";

		return codigo;

	}

}
