import java.util.Scanner;

public class Partido28 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner entrada = new Scanner(System.in);
		int acum = 0;
		double notaPar;
		double notaExa;	
		//PLANTILLA BUCLE FOR
		for (int i = 1; i <= 3; i++) {
			System.out.println("NOTA " + i + "ª EVALUACION.");
			System.out.println("Introduce la nota de los partidos:");
			notaPar = entrada.nextDouble();
			System.out.println("Introduce la nota del examen:");
			notaExa = entrada.nextDouble();
			if (notaPar > 0 && notaPar <= 4 && notaExa > 0 && notaExa <= 6) {
				int evaluacion = (int) (notaPar + notaExa);
				System.out.println("Nota de la " + i + "ª evaluacion: " + 
						evaluacion);
				acum = acum + evaluacion; 
			} 
			else {
				System.out.println("La nota es incorrecta");
			}
		}
		int notaFinal = acum / 3;
		System.out.println("La nota final del alumno es " + notaFinal);
		entrada.close();
	}
}
