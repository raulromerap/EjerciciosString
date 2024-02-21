package ejerciciosstring;

public class Ejercicio19 {

	public static void main(String[] args) {
		String cadena ="	PrUeba CaMEL casE ";
		System.out.println(camelCase(cadena));
	}
	
	public static String camelCase(String cadena) {
		String cadCamel="";
		
		String[] cadArray = cadena.trim().toLowerCase().split(" ");
		
		cadCamel += cadArray[0];
		
		for(int i=1; i<cadArray.length; i++) {
			
			cadCamel += Character.toUpperCase(cadArray[i].charAt(0)) + cadArray[i].substring(1);
		}
		
		return cadCamel;
	}

}
