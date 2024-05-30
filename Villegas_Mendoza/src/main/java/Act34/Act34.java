package Act34;

import java.util.Scanner;

public class Act34{
	public static void main(String[] args) throws InterruptedException{
		Scanner datos = new Scanner(System.in);
		
		int []ingreso = new int [12];
		
		for (int i=0; i<12; i++) {
			System.out.println("Ingresar los datos del ultimo año por mes.");
			System.out.println("Carga los ingresos del mes "+ (i+1)+" : ");
			ingreso [i] = datos.nextInt();
				
			if (ingreso[i]<100000) {
				System.err.println("En el mes "+ (i+1) +" hubo una ganancia menor a los 100000.");
			}
		}
	}
}