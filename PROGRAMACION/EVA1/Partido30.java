import java.util.Scanner;

public class Partido30 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		//DECLARAMOS LAS VARIABLES
		double notaPartidos; 
		double notaExamen; 
		System.out.println("Hola, ¿cuál es la nota de los partidos?");
		notaPartidos = entrada.nextDouble(); 		
		//PLANTILLA BUCLE WHILE
		while (notaPartidos < 0 || notaPartidos > 4) { 
			System.out.println("La nota no es correcta");
			System.out.println("Vuelve a introducir la nota de los partidos");
			notaPartidos = entrada.nextInt();
		}
		System.out.println("Hola, ¿cuál es la nota del examen?");
		notaExamen = entrada.nextDouble(); 
		while (notaExamen < 0 || notaExamen > 6) { 
			System.out.println("La nota no es correcta");
			System.out.println("Vuelve a introducir la nota de los exámenes");
			notaExamen = entrada.nextInt();
		}
		int notaFinal = (int) (notaPartidos + notaExamen); 
		System.out.println("La nota final del alumno es " + notaFinal);
		entrada.close();
	}
}
