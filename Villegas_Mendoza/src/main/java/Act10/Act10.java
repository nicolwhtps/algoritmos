package Act10;

import java.util.Scanner;

public class Act10 {
	
	public static void main(String[] args) {
	    Scanner datos = new Scanner (System.in);
			
		String nombre;
		String apellido;
		int num1;
		
		System.out.println("Ingrese su nombre: ");
		nombre = datos.next();
			
		System.out.println("Ingrese su apelido: ");
		apellido = datos.next();
		
		System.out.println("Ingrese un numero entre 0 y 99: ");
	    num1 = datos.nextInt();
	    
	    int numeroAleatorio = (int) (Math.random()*99);
	    
	    if (numeroAleatorio == num1) {
	    	
	    	System.out.println("¡GANASTE! ;)");	
	    
	    }
	    else {
	    	
	    	System.out.println(" Perdiste.¡JA, JA, JA! ");
	    	
	    }
	}
}