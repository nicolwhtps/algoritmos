package Act27;

import java.util.Scanner;

public class Act27 {

	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner(System.in);
		
		int contra, intentos = 0;
		boolean correcta = false;

		System.out.println("Ingrese la contraseña: ");
		contra = datos.nextInt();
        
		do {
			if (contra != 2008) {
				intentos++;
				System.out.println("Contraseña es incorrecta. Intentos: " + intentos);
				correcta = false;
				System.out.println("Ingrese la contraseña: ");
				contra = datos.nextInt();
			}
			else if (contra == 2008) {
				intentos++;
				correcta = true;
				System.out.println("La contraseña es correcta.");
				
			}
			if (intentos == 3) {
				intentos++;
				System.out.println("Su usuario se bloqueo.");
				
			} 
		} while (contra != 2008 && intentos <= 3);

	}
}