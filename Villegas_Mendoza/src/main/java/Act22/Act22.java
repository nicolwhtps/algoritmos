package Act22;
import java.util.Scanner;
public class Act22{
	
	public static void main(String[] args) {
		Scanner datos = new Scanner (System.in);
		
		String nombre;
		String apellido;
		int num;
	

		System.out.println("Ingrese su nombre: ");
		nombre = datos.next();
			
		System.out.println("Ingrese su apelido: ");
		apellido = datos.next();
		
		int numeroAleatorio = (int) (Math.random()*99);
		
		System.out.println("Ingrese un numero entre 0 y 99: ");
	    num = datos.nextInt();
		
		do  {   	
		    
		     if (num!=numeroAleatorio) {
			 System.out.println("Fallaste, ingrese un numero entre 0 y 99: ");
			 num = datos.nextInt(); 
			 num++;
			    }
		     if (num ==numeroAleatorio) {
		    	 System.out.println("Ganaste.");
		     }

		}
		while (num != numeroAleatorio); {
 	    	
		}
	}
}