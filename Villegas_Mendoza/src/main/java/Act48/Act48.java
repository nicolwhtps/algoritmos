package Act48;

import java.util.Arrays;
import java.util.Scanner;

public class Act48 {
	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner (System.in);
		
		String [] apellido= new String [4];
	    System.out.println("Ingrese 4 apellidos;");
	    
	    for(int i=0; i<4;i++) {	
		System.out.println("Apellido "+(i+1)+": ");
	    apellido[i]=entrada.next();
	    }
		
		Arrays.sort(apellido);
		System.out.println("Ordenado por orden alfabetico: ");
		
		for (String apellido1 : apellido) {
			System.out.println(apellido1);
			 Thread.sleep(1000);
		}
	
		
}
}