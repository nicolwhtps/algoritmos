package Act16;

import java.util.Scanner;

public class Act16{
	
	public static void main(String[] args) {
	 Scanner datos = new Scanner (System.in);
	 
	 int hora, minutos, segundos;
	
	 
	 System.out.println("Ingrese su hora: ");
	 hora = datos.nextInt();
	 System.out.println("Ingrese sus minutos: ");
	 minutos = datos.nextInt();
	 System.out.println("Ingrese el segundo: ");
	 segundos = datos.nextInt();
	 
	 if (hora <24 && hora >0) {
		 System.out.println("El valor es valido.");
	 } else {
		 System.out.println("Esta hora es incorrecta.");
	 } 
	 if (minutos <60 && minutos >0) {
		 System.out.println("los minutos ingresados son validos.");
	 } else {
		 System.out.println("El valor es incorrecto.");
	 }
	 if (segundos <60 && segundos >0) {
		 System.out.println("los segundos ingresados son validos.");
	 } else {
		 System.out.println("El valor es incorrecto.");
	 }
	}
}