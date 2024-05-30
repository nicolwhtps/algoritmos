package Act46;

import java.util.Scanner;

public class Act46{
	public static void main(String[] args) throws InterruptedException{
		Scanner datos = new Scanner(System.in);
		
		int [] num= {1011, 2367, 8748, 9121, 817, 6423, 2034};
		String [] nombre= {"Enrique","Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daniela"};
		int numSocio;
		
		System.out.println("Para encontrar un indivuido, ingresar numero de socio:");
		numSocio = datos.nextInt();
		
		for (int i = 0; i < nombre.length; i++) {
			if ( num[i]%2 == numSocio) {
				System.out.println("El numero "+numSocio+" de socio que usted ingreso le pertenece a "+ nombre [i]+".");
			   
		}
			else {
				System.out.println("El numero "+numSocio+" de socio que ingreso no se encontro.");
			   
			}
		}
	}
}			