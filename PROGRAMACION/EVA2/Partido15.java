import java.util.Scanner;

public class Partido15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
	
		String nombre = null; // VARIABLE NOMBRE
		boolean letras = true; // BOOLEAN LETRAS PARA VERIFICAR QUE TODO SEA LETRAS
		boolean cinco = true; // BOOLEAN CINCO PARA VERIFICAR QUE SEAN 5 CARACTERES
		
		System.out.println("Introduzca un nombre:");
		//USAMOS UN BUCLE DO WHILE PARA QUE PIDA AL MENOS UNA VEZ EL NOMBRE Y REPITA EL BUCLE MIENTRAS SEA FALSE
		do {
			nombre = entrada.next();
			int contLetras = nombre.length();
			letras = true;
			cinco = true;
			// CONDICION SI LAS LETRAS SON IGUAL A 5
			if (contLetras == 5){
				System.out.println("Su nombre tiene "+contLetras+ " caracteres.");
				// REALIZAMOS UN BUCLE FOR PARA COMPROBAR LOS CARACTERES UNO POR UNO
				for (int a = 1 ; a <=5 ; a ++) { 
					// CON ESTO VERIFICAMOS QUE LOS CARACTERES ESTEN EN LA TABLA ASCII (SOLO LETRAS)
					if (nombre.charAt(a-1)>=65 && nombre.charAt(a-1)<=90 || nombre.charAt(a-1)>=97 && nombre.charAt(a-1)<=122 || nombre.charAt(a-1)=='Ñ' || nombre.charAt(a-1)=='ñ') {
						// SI LA CONDICION SE CUMPLE LETRAS = TRUE
						System.out.println("El caracter "+nombre.charAt(a-1)+ " es una letra.");
					}
					else {
						// SI LA CONDICION SE CUMPLE LETRAS = FALSE
						letras = false;
						System.out.println("El caracter "+nombre.charAt(a-1)+ " no es una letra.");
					}
				}
			}
			
			else {
				//EN CASO DE QUE LA CONDICION NO SE CUMPLA LA VARIABLE CINCO PASA A FALSE
				cinco = false;
			}
			
			// SI LETRAS ES TRUE Y CINCO ES TRUE 
			if (letras == true && cinco == true) {
				System.out.println("Su nombre "+nombre+", ha sido introducido correctamente");
			}
			// SI LETRAS ES FALSE Y CINCO ES FALSE 
			else {
				System.out.println("Por favor, introduzca el nombre correctamente");
			}
		} while (letras != true || cinco != true);
		entrada.close();
	}
}
