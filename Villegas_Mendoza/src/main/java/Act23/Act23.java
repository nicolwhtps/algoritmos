package Act23;

import java.util.Scanner;

public class Act23  {
	
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		String nombre;
		String apellido;
		int num = 0;
		int intentos = 1 ;
		boolean quierosalir= false;
		
		System.out.println("Ingrese su nombre: ");
		nombre = datos.next();
			
		System.out.println("Ingrese su apelido: ");
		apellido = datos.next();
		
		int numeroAleatorio = (int) (Math.random()*99);
		
		while (num !=numeroAleatorio && quierosalir==false) {
			
		}
}
}
