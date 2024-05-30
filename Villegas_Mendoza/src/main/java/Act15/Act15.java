package Act15;

import java.util.Scanner;

public class Act15{
	
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		float total;
		float descuento;
		
		System.out.println("Ingrese el total de su compra: ");
		total = datos.nextFloat();
		
		descuento = total*0.9f; 
		
		if (total >15000) {
				
		System.out.println("Su descuento es: "+ descuento );
			
		}	
		else {
			System.out.println("Gracias por su compra. Vuelva pronto.");
		}
	}
}