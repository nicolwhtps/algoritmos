package Act6;

import java.util.Scanner;

public class VMactividad6{
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		float calificacion;
		
		System.out.println("Ingrese su calificacion, incluiyendo las decimales:");
		calificacion = entrada.nextFloat();
		double raiz_cuadrada = Math.sqrt(calificacion);
		int numRedondeado = (int) Math.round(calificacion);
		
		
		System.out.println("Su calificacion final es:" +numRedondeado);
	}
}