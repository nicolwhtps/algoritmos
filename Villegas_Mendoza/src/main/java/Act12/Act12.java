package Act12;

import java.util.Scanner;

public class Act12 {
	
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		int num;
		
		System.out.println("Ingrese su callificacion del 1 al 10: ");
		num = datos.nextInt();
		
		if (num > 10) {
			System.err.println("Valor incorrecto");
	
		}
		else if (num >= 1 && num<=3) {
			System.out.println("Es insuficiente");
		}
		
		else if (num >3 && num<6) {
			System.out.println("No logrado");
		}
		else if (num >= 6 && num<=7) {
			
			System.out.println("Es suficiente");
		}
		else if (num >=8 && num<=9) {
			System.out.println("Notable");
		}
		else if (num == 10) {
			System.out.println("Sobresaliente.");
		}
	}
}