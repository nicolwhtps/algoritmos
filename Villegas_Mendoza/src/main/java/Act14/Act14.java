package Act14;

import java.util.Scanner;

public class Act14{
	
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		int numero;
		
		System.out.println("Ingrese un numero: ");
		numero = datos.nextInt();
		
		if(numero != 0 ) {
			System.out.println("Se puede realizar la division. ");
		}
		else {
			System.out.println("No se puede realizar la division.");
	}
	
	}
}