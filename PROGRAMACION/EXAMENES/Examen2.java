public class Examen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Código de un programa en java llamado Examen2 * que dibuje un triángulo  igual que el triángulo de abajo de 7x5 con "<".
		 */

		// USAMOS UN BUCLE FOR PARA LAS FILAS DEL PRIMER TRIANGULO (USAREMOS LA VARIABLE "i"):
		for ( int i = 1 ; i <= 4; i++) {
			//BUCLE FOR PARA LOS ESPACIOS EN BLANCO DE CADA COLUMNA
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			// FOR PARA LAS COLUMNAS DE CADA FILA O LINEA (USAR LA VARIABLE "a"):
			for (int a = 0; a < i ; a++) {
				System.out.print("<");
			}
			System.out.println(""); // INTRODUCIMOS UN ESPACIO EN BLANCO PARA EL SALTO DE LINEA.
		}
		// USAMOS UN BUCLE FOR PARA LAS FILAS DEL SEGUNDO TRIANGULO (USAREMOS LA VARIABLE "i"):
		for ( int i = 1 ; i <= 3; i++) {
			//BUCLE FOR PARA LOS ESPACIOS EN BLANCO DE CADA COLUMNA
			for (int j = 1; j <= i + 1; j++) {
				System.out.print(" ");
			}
			if (i==2) { //REALIZAMOS UN IF PARA EL VALOR DE LA FILA A 2 QUE ESCRIBA UNA K
				// FOR PARA LAS COLUMNAS DE CADA FILA O LINEA (USAR LA VARIABLE "a"):
				for (int a = 4 ; a > i ; a--) {
					System.out.print("k");
				}
			}
			else {
				// FOR PARA LAS COLUMNAS DE CADA FILA O LINEA (USAR LA VARIABLE "a"):
				for (int a = 4 ; a > i ; a--) {
					System.out.print("<");
				}
			}
			System.out.println(" "); // INTRODUCIMOS UN ESPACIO EN BLANCO PARA EL SALTO DE LINEA.
		}
	}
}