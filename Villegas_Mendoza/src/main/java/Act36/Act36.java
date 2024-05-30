package Act36;

import java.util.Scanner;

public class Act36{
	public static void main(String[] args) throws InterruptedException{
		Scanner datos = new Scanner(System.in);
		  
		int ganancias, sum=0;
		int GMax=0, GMin= 999999;
		int i,iMayor=0, iMenor=0;
		
		for(i=8; i<17; i++) {
			System.out.println("Ingrese las ganancias de las "+(i+1)+": ");
			ganancias = datos.nextInt();
			
			if (ganancias>GMax) {
				GMax = ganancias;
				iMayor= i+1;
			}
			else if (ganancias<GMin) {
				GMin = ganancias;
				iMenor= i+1;
			}
			sum+= ganancias;
		}
		System.out.println("La hora en la que menor ingresos obtuvo es: "+iMenor+"hs");
		System.out.println("La hora en la que mas ingresos obtuvo es: "+iMayor+"hs");
		System.out.println("La ganancia total es: "+sum);
}
}