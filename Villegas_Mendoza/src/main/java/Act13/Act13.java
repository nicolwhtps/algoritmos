package Act13;

import java.util.Scanner;

public class Act13 {
	
	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
	    char remera;
		
		System.out.println("Ingrese una talla S, M, L: ");
		remera = datos.next().charAt(0);
		
		if (remera == 'S' || remera == 's' ) {
			
			System.out.println("Quedan cinco remeras");
		}
		else if (remera == 'M' || remera == 'm') {
			
			System.out.println("Quedan dos remeras.");
		}
		else if (remera == 'L' || remera == 'l') {
			
			System.out.println("No quedan remeras.");
		}
		else {
			System.out.println("Error. Dato incorrecto.");
		}
		
	}
}