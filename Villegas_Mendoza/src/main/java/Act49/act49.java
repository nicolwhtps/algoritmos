package Act49;

import java.util.Scanner;

public class act49 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese una lista de DNI: ");
		String input = new String();
		
		String[] Dni= input.split("");
		
		int[] Arrays = new int [Dni.length];
		
		for(int i=0; i<Dni.length; i++) {
			Arrays[i] = Integer.parseInt(Dni[i]);
			
		}
	}
}