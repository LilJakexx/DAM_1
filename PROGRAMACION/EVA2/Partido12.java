import java.util.ArrayList;
import java.util.Scanner;
public class Partido12 {


	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		ArrayList <String> users = new ArrayList <String> (3); //CREAMOS EL ARRAYLIST PARA USUARIOS 
		ArrayList <String> passwords = new ArrayList <String> (3); //CREAMOS EL ARRAYLIST PARA CONTRASEÑAS
		int intentos = 3; // CREAMOS UNA VARIABLE INTENTOS QUE NOS FUNCIONARA COMO CHIVATO EN CASO DE ERROR!
		boolean correcto = false; // CREAMOS UNA VARIABLE BOOLEAN QUE NOS SERVIRA PARA LOS BUCLES
		String usuario; // VARIABLE USUARIO PEDIDA POR TECLADO
		String password; // VARIABLE CONTRASEÑA PEDIDA POR TECLADO

		//USUARIOS
		users.add("Rober");
		users.add("Aimane");
		users.add("Andres");
		//CONTRASEÑA
		passwords.add("2222");
		passwords.add("3333");
		passwords.add("4444");

		System.out.println("INTRODUZCA SU NOMBRE DE USUARIO"); // PEDIMOS EL USUARIO POR TECLADO
		do {
			usuario = entrada.next();
			if (users.contains(usuario) ) { // COMPROBAMOS SI EL USUARIO ESTA DENTRO DEL ARRAYLIST
				System.out.println("EL USUARIO ES CORRECTO"); 
				intentos = 3; //SI EL USUARIO ES CORRECTO REINICIAMOS LOS INTENTOS A 3 PARA LAS CONTRASEÑAS
				do {
					System.out.println("INTRODUZCA SU CONTRASEÑA SEÑOR "+usuario);
					password = entrada.next();
					if (password.equals(passwords.get(users.indexOf(usuario)))){ //COMPROBAMOS QUE LA CONTRASEÑA INTRODUCIDA SEA CORRECTA 
						correcto = true; 
						System.out.println("BIENVENIDO " +usuario);
						break; // SI ES CORRECTO LA VARIABLE CORRECTO PASA A TRUE Y SALIMOS DEL BUCLE
					}
					else { // EN CASO DE QUE LA CONTRASEÑA NO SEA CORRECTA QUITAMOS UN INTENTO
						intentos = intentos - 1; 
						System.out.println("CONTRASEÑA INCORRECTA!! LE QUEDAN "+intentos);
					}
				} while (intentos > 0  && correcto == false );
			}
			else { // EN CASO DE QUE EL USUARIO NO SEA CORRECTO QUITAMOS UN INTENTO
				intentos = intentos - 1; 
				System.out.println("EL USUARIO NO ES CORRECTO!! LE QUEDAN "+intentos);
			}
		} while (intentos > 0 && correcto == false); //REPETIMOS EL BUCLE MIENTRAS EL NUMERO DE INTENTOS NO SEA CERO Y LA VARIABLE CORRECTO SEA FALSE
		if (intentos == 0) {
			System.out.println("SU EQUIPO HA SIDO BLOQUEADO!!");
		}
		entrada.close();
	}
}

