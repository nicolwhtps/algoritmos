package Act7;

import java.util.Scanner;

public class Act7 {
	
	public static void main(String[] args) {
		 Scanner datos = new Scanner (System.in);
		
		 System.out.println("Qu� calificaci�n tendr�s en laboratorio de algoritmos y estructura de datos?");
 
         int numeroaleatorio = (int) (Math.random()*10);
         
         System.out.println("Su calificacion sera un "  +numeroaleatorio);
	}
}