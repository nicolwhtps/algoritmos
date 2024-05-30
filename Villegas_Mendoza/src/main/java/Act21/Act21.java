package Act21;

public class Act21 {
	
	public static void main(String[] args) throws InterruptedException {
		
	int temp = 33;
	
	do{
		temp+=2;
		System.out.println("Temperatura de "+temp);
		Thread.sleep(20);
		
		if (temp == 85) {
			System.out.println("CUIDADO!, TEMPERATURA PELIGROSA.");
			Thread.sleep(1000);
			temp++;
		}
	
		else if (temp == 100) {
			System.out.println("VALOR EXTREMO. APAGANDO");
			
		}
	}
		
	 while (temp <=98);
}
	}