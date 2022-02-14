import java.util.Arrays;
import java.util.Scanner;

public class Partido5 {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner entrada = new Scanner(System.in);
int num;
int j; // VARIABLE J PARA SACAR LOS NUMEROS
int i; // VARIABLE I PARA VERIFICAR EL ARRAY
int x; // VARIABLE X PARA CONTAR LAS PERSONAS
int bingo [] = new int [15];
int numeros []= new int [15];
boolean repetido;

System.out.println("¿CUANTAS PERSONAS VAN A JUGAR?");
int personas=entrada.nextInt();
for (x=1 ; x<=personas; x++) { // BUCLE PARA ALCANZAR EL NUMERO DE PERSONAS
for (j=1; j<=numeros.length; j++) { // BUCLE PARA SACAR LOS NUMEROS
//ACCION 2: VERIFICAR NUMEROS REPETIDOS Y SUSTITUIRLOS
do {
repetido = false;
num =(int)(Math.random()*90+1);
for (i=1; i<=j; i++) {
if (num == numeros[i-1]) {
repetido = true; // CAMBIAMOS EL VALOR DE REPETIDO A TRUE
}
}
} while (repetido == true);
numeros [j-1]=num;
}
System.out.println("EL CARTON NUMERO "+x+ " TIENE LOS SIGUIENTES NUMEROS");
System.out.println(Arrays.toString(numeros));
}

System.out.println("INICIO DEL SORTEO:");
System.out.println("--------------");

//ACCIÓN 1: GENERAR NUMEROS ALEATORIOS.
for (int k=1; k<=bingo.length; k++) {
//ACCION 2: VERIFICAR NUMEROS REPETIDOS Y SUSTITUIRLOS
do {
repetido = false; //INICIALIZAMOS LA VARIABLE REPETIDO EN FALSE
num = (int) (Math.random()*15+1); //GENERAMOS UN NUMERO RANDOM PARA EL PUESTO NUMERO J DENTRO DEL ARRAY
for (int l=1; l<=k; l++) {
if (num == bingo[l-1]) {
repetido = true; // CAMBIAMOS EL VALOR DE REPETIDO A TRUE
}
}
} while (repetido == true); // REPETIMOS EL BUCLE HASTA QUE REPETIDO SEA IGUAL A FALSE
bingo [k-1]=num;
}
System.out.println(" ");
System.out.println("LOS NUMEROS PREMIADOS: ");
System.out.println(Arrays.toString(bingo));
System.out.println("--------------");
System.out.println("FIN DEL SORTEO.");
entrada.close();
}
}