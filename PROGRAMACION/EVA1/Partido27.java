import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Partido27 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la primera fecha: (dd/mm/yyyy)");
		String fecha1 = entrada.next();
		//Formateamos
		DateTimeFormatter convfecha = 
				DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//Pasamos a LocalDate
		LocalDate fecha1Date = LocalDate.parse(fecha1, convfecha);

		System.out.println("Introduce la segunda fecha: (dd/mm/yyyy)");
		String fecha2 = entrada.next();
		//Formateamos
		DateTimeFormatter convfecha2 = 
				DateTimeFormatter.ofPattern("dd/MM/yyyy");
		//Pasamos a LocalDate
		LocalDate fecha2Date = LocalDate.parse(fecha2, convfecha2);

		int diferenciaAnos=(int)ChronoUnit.YEARS.between(fecha1Date, 
				fecha2Date);
		int diferenciaMes=(int)ChronoUnit.MONTHS.between(fecha1Date, 
				fecha2Date);
		int diferenciaDias=(int)ChronoUnit.DAYS.between(fecha1Date, 
				fecha2Date);

		System.out.println("Entre la fecha" +fecha1+", y la fecha " +fecha2+ 
				", hay " +diferenciaAnos+ " años.");
		System.out.println("Entre la fecha" +fecha1+", y la fecha " +fecha2+ 
				", hay " +diferenciaMes+ " meses.");
		System.out.println("Entre la fecha" +fecha1+", y la fecha " +fecha2+ 
				", hay " +diferenciaDias+ " dias.");
		entrada.close();
	}
}
