package Act11;

import java.util.Scanner;

public class Act11 {
	
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		int num;
		
		System.out.println("Ingresar un numero: ");
		num = datos.nextInt();
		
		if (num > 0 ) {
			System.out.println("El numero ingresado es positivo.");
		}
		else if (num <0) {
	    	System.out.println("El numero ingresado es negativo.");
        }
		else  {
	    	System.out.println("A ingresado el cero.");
	    }
}
}