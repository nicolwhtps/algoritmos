package Act28;

public class Act28 {

	public static void main(String[] args) throws InterruptedException {
		
		int bat = 100;
		
		do {
		
		System.out.println(bat+"% Bateria");
		bat--;
		Thread.sleep(20);
		
		if (bat == 20) {
			System.err.println("Bateria baja.");
			Thread.sleep(1000);
		}
		else if (bat == 0) {
			
			System.err.println("Bateria agotada.");
		}
		}
		while (bat != 0);{
		
	}
}
}