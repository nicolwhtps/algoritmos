package Actenums;

import java.util.Scanner;
import enums.Mes;

public class enumact{

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
	
	Mes meses= null;
    String Mingreso;
    
    System.out.println("Ingrese un mes:");
    Mingreso = entrada.next().toUpperCase();
    
    try {
    	
    meses = Mes.valueOf(Mingreso);
    
    switch(meses) {
    case ENERO: 
    case MARZO:
    case MAYO: 	
    case JULIO:
    case AGOSTO:
    case OCTUBRE:
    case DICIEMBRE:
    	System.out.println(meses+" tiene 31 dias.");
    	break;
    case ABRIL:
    case JUNIO:
    case SEPTIEMBRE:
    case NOVIEMBRE:
    	System.out.println(meses+" tiene 30 dias.");
    	break;
    case FEBRERO:
    	System.out.println(meses+" tiene 28 dias.");
    	break;
    	default:
    		System.out.println("El mes que ingreso no es valido.");
    }
      }catch (IllegalArgumentException e) {
    	  System.out.println("El mes que ingreso no es valido.");
      }
    
}
}