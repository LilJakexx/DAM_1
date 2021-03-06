package Jugadores;

import java.util.Scanner;

public class JugadoresPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		//ACCION 1: CREAR JUGADOR.
		Jugadores jugador1 = new Jugadores();
		System.out.println("Introduzca el dni del nuevo jugador");
		jugador1.dni = entrada.next();
		System.out.println("Introduzca el nombre del nuevo jugador");
		jugador1.nombre = entrada.next();
		System.out.println("Introduzca el apellido del nuevo jugador");
		jugador1.apellido = entrada.next();
		//System.out.println("Introduzca el fechanac del nuevo jugador");
		//jugador1.fechanacimiento = "23081995";
		System.out.println("Introduzca el ciudad del nuevo jugador");
		jugador1.ciudad = entrada.next();
		System.out.println("Introduzca el pais del nuevo jugador");
		jugador1.pais = entrada.next();
		System.out.println("Introduzca el email del nuevo jugador");
		jugador1.email = entrada.next();
		System.out.println("Introduzca el telefono del nuevo jugador");
		jugador1.telefono= entrada.nextInt();
		System.out.println("Introduzca el login del nuevo jugador");
		jugador1.login= entrada.next();
		System.out.println("Introduzca el password del nuevo jugador");
		jugador1.password= entrada.next();
		System.out.println("Introduzca el dorsal del nuevo jugador");
		jugador1.dorsal= entrada.nextInt();
		System.out.println("Introduzca el equipo del nuevo jugador");
		jugador1.equipo= entrada.next();
		System.out.println("Introduzca el posicion del nuevo jugador");
		jugador1.posicion= entrada.next();
		//SE IMPRIME LA INFORMACION DEL JUGADOR 1
		System.out.println("EL JUGADOR 1: "+jugador1.toString());
		
		//ACCION 2: CAMBIAR LA CONTRASEŅA
		System.out.println("Cambiar contraseņa:");
		System.out.println("Introduzca la contraseņa actual:");
		String pass = entrada.next();
		
		//COMPROBAMOS QUE LA CONTRASEŅA INTRODUCIDA SE IGUAL A LA CONTRASEŅA DEL JUGADOR MEDIANTE EL METODO ConsultarPassword Y equals.
		if (pass.equals(jugador1.ConsultarPassword())) {
			System.out.println("Introduzca la nueva contraseņa");
			String nueva = entrada.next();
			//LLAMAMOS AL METODO CambiarPassword QUE RECIBE EL NUEVO VALOR Y CAMBIA LA CONTRASEŅA
			jugador1.CambiarPassword(nueva);
			System.out.println("La nueva contraseņa es: " +jugador1.ConsultarPassword());
		}
		
		else {
			System.out.println("ERROR! La contraseņa no es correcta.");
		}
		
		//LLAMAMOS AL METODO ConsultarPassword PARA CONSULTAR LA NUEVA CONTRASEŅA
		entrada.close();
	}
}
