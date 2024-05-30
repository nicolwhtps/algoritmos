package Act35;

import java.util.Scanner;

public class Act35{
	public static void main(String[] args) throws InterruptedException{
		Scanner scanner = new Scanner(System.in);
		
		int notas;
		int caliMin=999999 , caliMax=0;
		float sum = 0;
		
		System.out.println("Ingrese las 5 calificaciones del alumno. ");
		
		for(int i=0; i<5; i++) {
			System.out.println("Nota "+(i+1)+": ");
			notas = scanner.nextInt();
			
			if (notas>caliMax) {
				caliMax=notas ;
			}
			else if (notas<caliMin) {
				caliMin=notas;
			}
		    sum += notas;  
		}
		double promedio = (double) sum/5;
		
		System.out.println("La nota mas baja es: "+ caliMin);
		System.out.println("La nota mas alta es: "+ caliMax);
		System.out.println("El promedio es de un total "+ promedio);
	}
}