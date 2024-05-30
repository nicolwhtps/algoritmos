package Act41;

import java.util.Scanner;

public class Act41{
	public static void main(String[] args) throws InterruptedException{
		Scanner entrada = new Scanner(System.in);
		String [] Nombre = {"Messi", "Maradona", "Aymar", "Gallardo", "Palermo", "Riquelme", "Vagoneta", "Eito", "Leybovich", "Raffo"};

		for (String Nombre1:Nombre) {
			System.out.println(Nombre1);
			Thread.sleep(1000);
		}
		
}
}	