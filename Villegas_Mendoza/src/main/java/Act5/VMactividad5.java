package Act5;

import java.util.Scanner;

public class VMactividad5{
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
        float numero1;
		
		System.out.println("Ingrese un numero para calcular su raiz: ");
		numero1 = entrada.nextFloat();
		
		double raiz_cuadrada = Math.sqrt(numero1);
		
		System.out.println("La raiz es: " + raiz_cuadrada);
	
	}
}