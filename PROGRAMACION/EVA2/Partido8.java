import java.util.Scanner;

public class Partido8 {

	public static void main(String[] args) {
		//4 dimensiones para guardar Mes, día, hora, minuto
		Scanner lectura = new Scanner(System.in);
		String fecha[][][][]= new String[12][31][24][60]; // array donde guardo mes dia hora del año actual
		String nombre;
		System.out.println("Introduce el Nombre: ");
		nombre=lectura.next();  
		fecha[0][10][10][20]=nombre;// decimos que el valor del array en esa posicion equivale a lectura
		System.out.println(fecha[0][10][10][20]);// comprobamos que se ha guardado correctamente
		lectura.close();

	}

}