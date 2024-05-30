package Act33;

import java.util.Scanner;

public class Act33{
	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		
		String[] jugadores = new String[11];
		int [] edad = new int [11];
		
		for (int i=0; i<11; i++) {
			System.out.println("Ingrese el nombre del jugador: ");
			jugadores[i]= datos.next();
			
			System.out.println("Ingrese su edad: ");
			edad[i]= datos.nextInt();
			Thread.sleep(20);
		}
		
		for(int i=0; i<11; i++) {
			System.out.println("El nombre del jugador "+i+" es: "+jugadores[i]);
			System.out.println("La edad de el jugador "+i+" es:"+edad[i]);
		}
	}
}
// Para este ejercicio lo mas facil es utilizar arrays.