import java.util.Scanner;

public class Partido32 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int nota=0;
		int suspensos=0;
		int aprobados=0;
		double notas=0;
		int notaMedia=0;
		double notaDecimal=0;

		for (int alumno=1; alumno <=4; alumno++) {
			System.out.println("INTRODUZCA LA NOTA DEL ALUMNO:");
			nota = entrada.nextInt();
			while (nota < 0 || nota>10) {
				System.out.println("ERROR!! INTRODUZCA LA NOTA DE NUEVO");
				nota = entrada.nextInt();
			}
			if (nota<5) {
				suspensos = suspensos + 1;
			}
			else {
				aprobados = aprobados + 1;
			}
			notas = notas + nota;
		}

		notaDecimal = notas / 4;
		notaMedia = (int) Math.round(notaDecimal);
		System.out.println("La nota media con decimales es: "+notaDecimal);
		System.out.println("La nota media redondeada es: "+notaMedia);
		System.out.println("Los alumnos aprobados son: "+aprobados);
		System.out.println("Los alumnos suspensos son: "+suspensos);

		entrada.close();
	}
}
