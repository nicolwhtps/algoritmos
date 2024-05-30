package Act42;

import java.util.Scanner;

public class Act42{
	public static void main(String[] args) throws InterruptedException{
		Scanner entrada = new Scanner(System.in);
		int [] num = new int [3];
		int numeroAleatorio = (int) (Math.random()*50);
		System.err.println("\t Juego de Adivininanzas");
		
		for (int i=0; i<3; i++) {
			System.out.println("Ingrese un numero: ");
			num [i] = entrada.nextInt();
			
			if(num [i] == numeroAleatorio) {
				System.out.println("Acertaste, felicidades! ");
			}		
		}
		
		System.err.println("Perdiste! JA!");
	    System.out.println("El numero aleatorio era: "+numeroAleatorio);		
}	
}