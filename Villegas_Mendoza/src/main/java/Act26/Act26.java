package Act26;

import java.util.Scanner;

public class Act26 {

	public static void main(String[] args) throws InterruptedException {
		Scanner datos = new Scanner(System.in);

		int contra, intentos = 0;

		System.out.println("Ingrese la contrase�a: ");
		contra = datos.nextInt();

		while (contra != 2008 && intentos <= 3)	{

			if (intentos == 3) {
				intentos++;
				System.out.println("Su usuario se bloqueo.");
			} else if (contra != 2008) {
				intentos++;
				System.out.println("Contrase�a es incorrecta. Intentos: " + intentos);
				System.out.println("Ingrese la contrase�a: ");
				contra = datos.nextInt();
				
			} else if (contra == 2008) {
				intentos++;
				System.out.println("La contrase�a es correcta.");
			}
		}
	}
}