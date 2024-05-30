package Act18;

import java.util.Scanner;

public class Act18 {
	public static void main(String[] args) {
		
	Scanner datos = new Scanner(System.in);
		
	    char remera;
	    
	    System.out.println("Ingrese una talla S, M, L: ");
		remera = datos.next().charAt(0);
		
		switch (remera) {
		case 'S':
			System.out.println("Quedan cinco remeras");
			break;
		case 's':
			System.out.println("Quedan cinco remeras");
			break;
		case 'M':
			System.out.println("Quedan dos remeras.");
			break;
		case 'm':
			System.out.println("Quedan dos remeras.");
			break;
		case 'L':
			System.out.println("No quedan remeras.");
			break;
		case 'l':
			System.out.println("No quedan remeras.");
			break;
		default: 
			System.out.println("Dato incorrecto.");
			break;
		}
	
}
}