package Act8;

import java.util.Scanner;

public class Act8{
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
	
		float num;
		int sum, mul;
		
	System.out.println("Ingrese un numero entero con decimales: ");
	num = datos.nextFloat();
	
	int potencia = (int) Math.pow(num,2);
	int numeroAleatorio = (int) Math.random();
	
	sum = potencia + numeroAleatorio;
	mul= sum*7;
	
	double raiz_cuadrada = Math.sqrt(num);
	
	System.out.println("Su resultado es "+ raiz_cuadrada);
		
}
}