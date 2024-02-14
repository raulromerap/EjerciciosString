package ejerciciosstring;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner lectura = new Scanner(System.in);

		String contraseña = "";
		
		String intento = "";
		
		String resultado = "";
		
		System.out.println("Escribe la contraseña");
		contraseña = lectura.next();
		
		do {
			
			resultado = "";
			System.out.println("Adivina la contraseña");
			intento = lectura.next();
			
			while(contraseña.length() != intento.length()) {
				System.out.println("La longitud de la contraseña es " + contraseña.length());
				System.out.println("Vuelva a intentarlo");
				intento = lectura.next();
			}
			
			for(int i = 0; i < intento.length(); i++) {
				if(contraseña.charAt(i) == intento.charAt(i)) {
					resultado += intento.charAt(i);
				}else {
					resultado += "*";
				}
			}
			System.out.println(resultado);
			
		}while(!contraseña.equals(resultado));
		
		System.out.println("Enhorabuena!! Has acertado");

		lectura.close();
	
	}

}
