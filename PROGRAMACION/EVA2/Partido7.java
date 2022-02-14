import java.util.Arrays;
import java.util.Scanner;

public class Partido7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int num;
		int k; // VARIABLE J PARA SACAR LOS NUMEROS 
		int i; // VARIABLE I PARA VERIFICAR EL ARRAY
		int l; // VARIABLE X PARA CONTAR LAS PERSONAS
		int bingo [] = new int [15];
		int numeros [][]= new int [22][15];
		boolean repetido;

		//ACCION 1: CREAMOS LOS CARTONES Y LOS NUMEROS
		for (k=1 ; k<=22; k++) {
			System.out.println("EL CARTON NUMERO "+k+ " TIENE LOS SIGUIENTES NUMEROS");
			for (l=1; l<=15; l++) { // BUCLE PARA SACAR LOS NUMEROS
				//ACCION 2: VERIFICAR NUMEROS REPETIDOS Y SUSTITUIRLOS
				do {
					repetido = false;
					num =(int)(Math.random()*90+1);
					for (i=1; i<=l; i++) {
						if (num == numeros[k-1][l-1]) {
							repetido = true; // CAMBIAMOS EL VALOR DE REPETIDO A TRUE
						}
					}
				} while (repetido == true);
				numeros [k-1][l-1]=num;
			}
			//ACCION 3: VISUALIZAMOS TODOS LOS NUMEROS DE LOS CARTONES
			for (l=1; l<=15; l++) {
				System.out.print(+numeros[k-1][l-1]+" ");
			}
			System.out.println("");
		}

		System.out.println("INICIO DEL SORTEO:");
		System.out.println("--------------");

		//ACCIÓN 1: GENERAR NUMEROS ALEATORIOS.
		for (int x=1; x<=bingo.length; x++) {
			//ACCION 2: VERIFICAR NUMEROS REPETIDOS Y SUSTITUIRLOS
			do {
				repetido = false; //INICIALIZAMOS LA VARIABLE REPETIDO EN FALSE
				num = (int) (Math.random()*15+1); //GENERAMOS UN NUMERO RANDOM PARA EL PUESTO NUMERO J DENTRO DEL ARRAY
				for (int y=1; y<=x; y++) {
					if (num == bingo[y-1]) {
						repetido = true; // CAMBIAMOS EL VALOR DE REPETIDO A TRUE
					}
				}
			} while (repetido == true); // REPETIMOS EL BUCLE HASTA QUE REPETIDO SEA IGUAL A FALSE
			bingo [x-1]=num;
		}
		System.out.println("LOS NUMEROS PREMIADOS: ");
		System.out.println(Arrays.toString(bingo));
		System.out.println("--------------");
		System.out.println("FIN DEL SORTEO.");

		entrada.close();
	}
}