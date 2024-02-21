package ejerciciosstring;

public class Ejercicio17 {

		public static final String FINALCOMENT = "*/";
		public static final String INICIOCOMENT = "/*";
		
		public static void main(String[] args) {
			String codigoC = "/* comentario inicial*/ if (a==3) /* igual a tres */ a++; /* incrementamos a */";
			System.out.println(sinComentarios(codigoC));
		}

		public static String sinComentarios(String codigoC) {
			String cadSinComentarios = "";
			int inicio = codigoC.indexOf(INICIOCOMENT);
			int fin = 0;
			
			while(inicio!=-1) {
				cadSinComentarios += codigoC.substring(fin, inicio);
				fin = codigoC.indexOf(FINALCOMENT, inicio)+FINALCOMENT.length();
				inicio = codigoC.indexOf(INICIOCOMENT, fin);
			}
			
			return cadSinComentarios;
		}
		
		

}
