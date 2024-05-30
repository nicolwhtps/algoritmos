package Act43;

import java.util.Scanner;

public class Act43 {
	public static void main(String[] args) throws InterruptedException{
		Scanner entrada = new Scanner(System.in);
	
		int [] num = new int [5];
		int i;
		
		for (i=0; i<5; i++) {
			System.out.println("Ingrese un numero: ");
			num[i] = entrada.nextInt();
		}
		
		for(i=0; i<5; i++) {
		if(num [i] > 0) {
			System.out.println("Los numeros ingresados fueron: "+num[i]);
        }
}
}
}