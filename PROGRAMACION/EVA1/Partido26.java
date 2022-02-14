import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Partido26 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		LocalDateTime myDateObj = LocalDateTime.now();
		//EEEE para sacar el dia de la semana entero / dd para el dia del mes  
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("EEEE");  
		String formattedDate = myDateObj.format(myFormatObj); 
		DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("HH:mm");  
		//HH:mm para sacar las horas formato 24 H
		String formattedDate2 = myDateObj.format(myFormatObj2);

		//PEDIMOS LOS DATOS DEL USUARIO (NOMBRE Y FECHA DE NACIMIENTO)
		System.out.println("Indica cual es tu nombre:");
		String nombre=entrada.next();
		System.out.println("Indica tu edad:");
		int edad=entrada.nextInt();
		System.out.println("Desea que SHIBA INU valga:");
		double shiba=entrada.nextDouble();

		System.out.print("Hola "+nombre+ ", tienes "+edad+ " años y quieres que el SHIBA INU valga " +shiba+ " euros.");
		//IMPRIMIMOS LA FECHA ACTUAL
		System.out.print(" Hoy es " + formattedDate+ ",");  
		System.out.print(" son las " +formattedDate2+ " horas.");
		entrada.close();
	}
}
