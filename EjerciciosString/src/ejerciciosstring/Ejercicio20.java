package ejerciciosstring;

import java.util.Arrays;

public class Ejercicio20 {

	public static void main(String[] args) {
		String frase = "Hola a todos, soy marco";
		int numero = 4;
		
		System.out.println(Arrays.toString(dividePalabra(frase, numero)));
	}
	public static String[] dividePalabra(String frase, int numCaracteres) {
		
		int tamanyo = (int) Math.ceil((double)frase.length()/numCaracteres);
		String[] arrayPalabras = new String[tamanyo];
		
				
		for(int i=0; i<arrayPalabras.length; i++) {
			if(numCaracteres*(i+1) > frase.length()) {
				arrayPalabras[i] = frase.substring(numCaracteres*i);
			} else {
				arrayPalabras[i] = frase.substring(numCaracteres*i, numCaracteres*(i+1));
			}
		}
		
		
		return arrayPalabras;
	}

}
