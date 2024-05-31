package Act46;

import java.util.Scanner;

public class Act46{
	public static void main(String[] args) throws InterruptedException{
		Scanner datos = new Scanner(System.in);
		
		int [] num= {1011, 2367, 8748, 9121, 817, 6423, 2034};
		String [] nombre= {"Enrique","Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daniela"};
		int numSocio, numnombre=-1;
		
		System.out.println("Para encontrar un indivuido, ingresar numero de socio:");
		numSocio = datos.nextInt();
		
		for (int i = 0; i <7; i++) {
			if (num[i]%2==0) {
				continue;	   
		    }
			if (num[i]==numSocio) {
				numnombre=i;
			}	
			}
		if (numnombre!=-1) {
				String pp = nombre[numnombre]; 
					System.out.println("El numero "+numSocio+" de socio que usted ingreso le pertenece a "+pp+".");
				}
		}	
	}