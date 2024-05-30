package Act4;

import java.util.Scanner;

public class VillegasMendozaactividad4 {
	
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		int anos, meses, semanas, dias;
		
		System.out.println("Ingrese la catidad de años: ");
		anos = datos.nextInt();
		System.out.println("ingrese la cantidad de meses: ");
		meses = datos.nextInt();
		System.out.println("Ingrese la cantidad de semanas: ");
		semanas = datos.nextInt();
		
		dias = anos*365 + meses*30 + semanas*7;
		
		System.out.println("Cantidad de dias: " + dias);
		
	}
}