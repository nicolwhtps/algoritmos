package Act25;

import java.util.Scanner;

public class Act25  {
	
	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner (System.in);
		
		boolean salir= false;
		String resp;
		int contador = 0;
		
		do {
			
			System.out.println("Puedo salir? ");
			resp = datos.next();
			if (resp.equals("SI")|| resp.equals("si")) {
				System.out.println("Yupi!");	
				salir = true;
			}
			else if (resp.equals("NO")|| resp.equals ("no")) {
				Thread.sleep(500);
				contador++;
			}
			
		}
		
		while (salir==false);
}
}