package Act19;

import java.util.Scanner;

public class Act19{ 
	
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		int opcion;
		
		System.out.println("Ingrese una opcion del 1 al 5: ");
	 
		opcion = datos.nextInt();
		
		switch (opcion) {
		
		case 1:
			System.out.println("Es cafe cortado.");
			break;
		case 2:
			System.out.println("Es cafe latte.");
			break;
		case 3:
			System.out.println("Es cafe solo.");
			break;
		case 4:
			System.out.println("Es cafe lagrima.");
			break;
		case 5:
			System.out.println("Saliendo del programa...");
			break;
		default:
            System.err.println("Opcion erronea.");
			break;
	
		}
		
		
	}
}