package Act3;

import java.util.Scanner;

public class VillegasMendozaactividad3 {
	
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		float num1, num2, suma, resta, multiplicar, dividir ;
		String nombre;
		
		System.out.println("Ingrese su nombre: "); 
		nombre= datos.next();
		System.out.println("Ingrese un numero: " );
		num1 = datos.nextFloat();
		System.out.println("Ingrese un segundo numero: ");
		num2 = datos.nextFloat();
		
		suma= num1 + num2;
		int sumaInt = (int) suma;
		
		System.out.println("El resultado de la suma es: " + suma );
		System.out.println("El resultado de la suma en numero entero es:" + sumaInt );
		
	}
}