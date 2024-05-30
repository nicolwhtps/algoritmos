package Act40;

import java.util.Scanner;

public class Act40{
	public static void main(String[] args) throws InterruptedException{
		Scanner entrada = new Scanner(System.in);
		int [] temp =new int[5];
		int sum=0;
		
		System.out.println("Ingrese 5 temperaturas.");
		
		for (int i=0; i<5; i++) {
			System.out.println("Temperatura "+(i+1)+": ");
			temp[i] = entrada.nextInt();
			
			sum += temp[i];
		}
		
		float promedio = (float) sum/5; 
		System.out.println("El promedio de las temperaturas es: "+promedio);
}
}