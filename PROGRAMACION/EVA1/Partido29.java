import java.util.Scanner;

public class Partido29 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double notaPartidos;
		double notaExamen;	
		System.out.println("Introduzca la nota de los partidos");	
		// PLANTILLA BUCLE DO WHILE
		do {
			notaPartidos = entrada.nextDouble();
		} while (notaPartidos < 0 || notaPartidos > 4);
		System.out.println("La nota de los partidos es igual a " + notaPartidos);
		System.out.println("Introduzca la nota de los exámenes");	
		// PLANTILLA BUCLE DO WHILE
		do {
			notaExamen = entrada.nextDouble();
		} while (notaExamen < 0 || notaExamen > 6);
		System.out.println("La nota de los partidos es igual a " + notaExamen);
		int notaFinal = (int) (notaPartidos + notaExamen);
		System.out.println("La nota final del alumno es " + notaFinal);
		entrada.close();
	}
}
