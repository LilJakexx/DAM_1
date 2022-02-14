
public class Partido4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DECLARACIÓN DE VARIABLES:
		int num; // DECLARAMOS LA VARIABLE NUM QUE NOS SERVIRÁ PARA COMPROBAR VALORES REPETIDOS DENTRO DEL ARRAY
		int j; // VARIABLE J PARA EL BUCLE FOR DEL ARRAY
		int i; // VARIABLE I PARA EL BUCLE FOR DEL ARRAY QUE NOS SERVIRÁ PARA RECORRER EL ARRAY Y VERIFICAR REPETIDOS
		boolean repetido; // VARIABLE REPETIDO PARA COMPROBAR SI SE REPITE UN NÚMERO EN LA LISTA (TIPO BOOLEAN PORQUE ASÍ LO ENTIENDO MÁS FACIL)
		int bingo []= new int [10];
		System.out.println("INICIO DEL SORTEO:");
		System.out.println("--------------");

		//ACCIÓN 1: GENERAR NÚMEROS ALEATORIOS.
		for (j=1; j<=7; j++) {
			//ACCIÓN 2: VERIFICAR NUMEROS REPETIDOS Y SUSTITUIRLOS
			do {
				repetido = false; //INICIALIZAMOS LA VARIABLE REPETIDO EN FALSE
				num = (int) (Math.random()*10+1); //GENERAMOS UN NUMERO RANDOM PARA EL PUESTO NÚMERO J DENTRO DEL ARRAY
				for (i=1; i<=j; i++) {
					if (num == bingo[i-1]) {
						repetido = true; // CAMBIAMOS EL VALOR DE REPETIDO A TRUE
					}
				}
			} while (repetido == true); // REPETIMOS EL BUCLE HASTA QUE REPETIDO SEA IGUAL A FALSE
			bingo [j-1]=num;
		}
		//ACCIÓN 3: VISUALIZAR LOS VALORES
		for(j=1; j<=7; j++) {

			System.out.println("El siguiente número que sale es "+ bingo [j-1]);
		}
		System.out.println("--------------");
		System.out.println("FIN DEL SORTEO.");
	}

}
