package Act44;

import java.util.Scanner;

public class Act44 {
	public static void main(String[] args) throws InterruptedException{
		Scanner entrada = new Scanner(System.in);
		int [] DNI = new int[4];
		int i;
		
		for (i=0; i<4; i++) {
			System.out.println("Ingrese un DNI: ");
			DNI [i] = entrada.nextInt();	
		}
		
		for (i=0; i<4; i++) {
			if (DNI [i]%2==0) {
				System.out.println("Los DNI ingresados fueron: "+DNI[i]);
			}
		}
}
}