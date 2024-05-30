package Act38;

import java.util.Scanner;

public class Act38{
	public static void main(String[] args) throws InterruptedException{
		Scanner entrada = new Scanner(System.in);
		int cMayor=0, cMenor=999999;
		
		for (int i=8; i<19; i+=2) {
			System.out.println("Ingrese la cantidad de clientes de las "+(i+1)+"hs: ");
			int clientes = entrada.nextInt();
			
			if (clientes>cMayor) {
				cMayor = clientes;
			}
			else if (clientes<cMenor) {
				cMenor = clientes;
			}
		}
		System.out.println("La cantidad menor con clientes fue a las: "+cMenor);
		System.out.println("La cantidad mayor con clientes fue a las: "+cMayor);
}
}	