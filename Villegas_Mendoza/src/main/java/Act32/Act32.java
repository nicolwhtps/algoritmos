package Act32;

import java.util.Scanner;

public class Act32 {
	public static void main(String[] args) throws InterruptedException{
		Scanner datos = new Scanner (System.in);
		
		int num1;
		
		System.out.println("Ingrese un numero: ");
	    num1 = datos.nextInt();
		
			for (int num=1; num<=20; num++) {	
				System.out.println("el resulatdo de su multiplicacion es: "+ num1*num);
				Thread.sleep(20);
		}
	}
}