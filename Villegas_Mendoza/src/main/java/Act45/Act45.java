package Act45;

import java.util.Scanner;

public class Act45{
	public static void main(String[] args){
		Scanner datos = new Scanner(System.in);
		
		int [] num= {1011, 2367, 8748, 9121, 817, 6423, 2034};
		String [] nombre= {"Enrique","Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daniela"};
        int numeroaSociado;
       
		System.out.println("Para encontrar un indivuido, ingresar numero de socio: ");
		numeroaSociado = datos.nextInt();
		
		
		for (int i = 0; i < num.length; i++) {
			if ( num[i] == numeroaSociado) {
			System.out.println("El numero "+numeroaSociado+" de socio que usted ingreso le pertenece a "+ nombre [i]+".");
		    break;
			}	    
	}	
}
}	