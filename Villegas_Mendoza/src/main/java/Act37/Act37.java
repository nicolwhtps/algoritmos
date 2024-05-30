package Act37;

import java.util.Scanner;

public class Act37{
	public static void main(String[] args) throws InterruptedException{
		Scanner datos = new Scanner(System.in);
		char letra;
		
		for(letra = 'A'; letra<='Z'; letra++) {
			if (letra =='A'||letra == 'E' ||letra =='I'||letra=='O'||letra=='U' ) {
				System.out.println(letra);
				Thread.sleep(20);
			}
			
		}
}
}