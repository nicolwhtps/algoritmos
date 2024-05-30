package Act30;

public class Act30 {

	public static void main(String[] args) throws InterruptedException {
		
		for (int s=0; s<=100; s++ ) {
			System.out.println("Usted tiene "+s);
			Thread.sleep(20);
			
			if (s == 100) {
				System.err.println("felicidades lograste llegar a los 100 seguidores!");
		}
}
}
}