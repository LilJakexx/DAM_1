import java.util.Scanner;

public class Partido23 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double constante = 166.386;
		int peseta;
		int euro;
		System.out.println("Introduce la cantidad de pestas a convertir");
		peseta=entrada.nextInt();
		System.out.println("Introduce la cantidad de euros a convertir");
		euro=entrada.nextInt();
		//REALIZAMOS LAS OPERACIONES
		double pesetas = (euro * constante); 
		double euros = (peseta / constante);
		//IMPRIMIMOS POR PANTALLA    
		System.out.println(+peseta+" pesetas son " 
				+String.format("%.2f",+euros)+ 
				" €"); //STRING.FORMAT PARA REDUCIR LOS DECIMALES A DOS.
		System.out.println(+euro+" euros son "+pesetas);
		//CERRAMOS LA VARIABLE DE SCANNER    
		entrada.close();
	}
}
