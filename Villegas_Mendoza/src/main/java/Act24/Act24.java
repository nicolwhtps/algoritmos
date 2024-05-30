package Act24;

import java.util.Scanner;

public class Act24  {
	
	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner (System.in);
		
		float num1, num2, sum;
		int salir = 0;
		boolean qsalir = false;
		
		do {
			
		System.out.println("Ingrese un numero; ");
		num1 = datos.nextFloat();
		System.out.println("Ingrese un segundo numero; ");
		num2 = datos.nextFloat();
		
		sum =  num1 + num2;

		Thread.sleep(500);
		System.out.println("El resultado de la suma es: "+ sum);
		Thread.sleep(500);
		System.out.println("Para salir ingrese el 0. De lo contrario ingrese cualquier otro numero.");
		salir= datos.nextInt();
		
		if (salir == 0) {
			 qsalir = true;
			}
		else {
			qsalir= false; 
		}
		Thread.sleep(500);
		}
		while (qsalir==false);
		Thread.sleep(500);
		System.out.println("Saliendo del programa...");
	    
}
}