package Act47;

import java.util.Arrays;
import java.util.Scanner;

public class Act47{
	public static void main(String[] args) throws InterruptedException{
		Scanner entrada = new Scanner (System.in);
		
		String apellido;
		int cantidadent;
		
		System.out.println("Ingrese la cantidad de notas: ");
		cantidadent = entrada.nextInt();
		
		float []notas= new float [cantidadent];
		
		System.out.println("Ingrese el apellido del alumno: ");
		apellido = entrada.next();
		
		for (int i=0; i<cantidadent; i++) {
		System.out.println("Ingrese las notas del alumno: ");
		notas [i]= entrada.nextFloat();
	    }	
		
		float [] notascopia = Arrays.copyOf (notas, cantidadent);
		Arrays.sort(notascopia);
		
		System.out.println("Notas desordenadas:");
		for(int i=0; i<cantidadent; i++) {
			System.out.println("Las notas de "+apellido+" es: "+notas[i]);
		}
		
		System.out.println("Notas Ordenadas:");
		for(int i=0; i<cantidadent; i++) {
			int teco = Arrays.binarySearch(notas, notas[i]);
			System.out.println("Las notas de "+apellido+" es: "+notascopia[i]);
		}	
	}		
}