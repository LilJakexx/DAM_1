import java.util.Arrays;

public class Partido1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loteria [] = new int [13];
		int num;
		boolean repetido = false;

		//ACCIÓN 1: GENERAR NUMEROS ALEATORIOS.
		for (int x=1; x<=loteria.length; x++) {
			//ACCION 2: VERIFICAR NUMEROS REPETIDOS Y SUSTITUIRLOS
			do {
				repetido = false; //INICIALIZAMOS LA VARIABLE REPETIDO EN FALSE
				num = (int) (Math.random()*100000); //GENERAMOS UN NUMERO RANDOM PARA EL PUESTO NUMERO J DENTRO DEL ARRAY
				for (int y=1; y<=x; y++) {
					if (num == loteria[y-1]) {
						repetido = true; // CAMBIAMOS EL VALOR DE REPETIDO A TRUE
					}
				}
			} while (repetido == true); // REPETIMOS EL BUCLE HASTA QUE REPETIDO SEA IGUAL A FALSE
			loteria [x-1]=num;
		}
		System.out.println("LOS NUMEROS PREMIADOS SON: ");
		System.out.println(Arrays.toString(loteria));

	}

}
