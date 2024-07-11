import java.util.Scanner; 

public class funcion {
	
	static Scanner entrada = new Scanner (System.in);
	static String apellido;
	static float altura = 1.8f;
	
	public static void IngresarNombre() {
	
		System.out.print("Ingrese tu nombre: ");
		String nombre = entrada.next();//La variable "nombre" es local, pertenece a cada funcion, y solo ocupa memoria cuando se llama la fuincion. 
		
		
		
		System.out.print("Ingresar tu apellido: ");
		apellido = entrada.next();//La variable "apellido" es global, o sea que siempre va a ocupar la memoria.
		/*No contiene parametros, y tampoco argumentos. Los Parametos son los valores que se esperan en la funcion.
		 * Los Argumentos son los datos que se ingresan.*/
		 }
	public static float AlmacenarAltura(float a) {
		a = altura;
		return altura;
		/*Comentá el proceso, es decir: variable global -> argumento -> parámetro -> función -> retorno -> mostrar resultado en un syso.
          Ahora, en el argumento de la función principal, en vez de colocar “altura”, colocá 1.75f. ¿Qué ocurrió? Sucede que ya estaba declarada, por lo tanto  
        */
	}
	
	public static int FiltrarEdad(int edad){
		
		return edad;
	}
	public static void main (String[] args) {
	
		IngresarNombre();
		System.out.println( AlmacenarAltura(altura));
		FiltrarEdad(25);
		
		}
}