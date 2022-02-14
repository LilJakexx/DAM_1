import java.time.LocalDateTime; //Import the LocalDateTime class
import java.time.format.DateTimeFormatter; //Import the DateTimeFormatter class
import java.util.Scanner;
public class Partido25 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		//FORMATO DE LA FECHA ACTUAL
		LocalDateTime myDateObj = LocalDateTime.now();  
		//EEEE para sacar el dia de la semana entero / dd para el dia del mes
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("EEEE, dd");
		String formattedDate = myDateObj.format(myFormatObj); 
		DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("MMMM");  
		//MMMM para sacar el nombre del mes entero
		String formattedDate2 = myDateObj.format(myFormatObj2);
		DateTimeFormatter myFormatObj3 = DateTimeFormatter.ofPattern("yyyy");  
		//yyyy para sacar el numero del año actual
		String formattedDate3 = myDateObj.format(myFormatObj3); 
		//Formula casting Juan
		Integer iNum = Integer.valueOf(formattedDate3);				
		int anno = iNum.intValue();
		//PEDIMOS LOS DATOS DEL USUARIO (NOMBRE Y FECHA DE NACIMIENTO)
		System.out.println("Indica cual es tu nombre:");
		String nombre=entrada.next();
		System.out.println("Indica tu dia de nacimiento:");
		int dia=entrada.nextInt();
		System.out.println("Indica tu mes de nacimiento:");
		String mes=entrada.next();
		System.out.println("Indica tu año de nacimiento:");
		int ano=entrada.nextInt();	
		int cumples=anno-ano;
		//IMPRIMIMOS EL NOMBRE DEL USUARIO Y LA FECHA DE NACIMIENTO
		System.out.println("Hola "+nombre);
		System.out.println("Naciste el "+dia+" de "+mes+" del "+ano+ ", en el "+anno+ " cumples "+cumples);
		//IMPRIMIMOS LA FECHA ACTUAL
		System.out.print("Hoy es " + formattedDate);  
		System.out.print(" de " + formattedDate2);
		System.out.print(" de " + formattedDate3);
		entrada.close();
	}
}
