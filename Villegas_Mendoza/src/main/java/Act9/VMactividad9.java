package Act9;

import java.util.Scanner;

public class VMactividad9{
	
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		String nombre;
		String apellido;
		
		System.out.println("Ingrese su nombre: ");
		nombre = datos.next();
		
		System.out.println("Ingrese su apelido: ");
		apellido = datos.next();
		
		int numeroaleatorio = (int) (Math.random()*99); 
				
		System.out.println("Su nombre es " + nombre);
		System.out.println("Su apellido es " + apellido);
		System.out.println("Numero de bingo: " + numeroaleatorio);
	}
}