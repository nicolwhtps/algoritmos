package Act20;

public class Act20 {
	public static void main(String[] args) throws InterruptedException {
		
		int seguidores = 0;
		do {
		System.out.println("Seguidores actuales:"+ seguidores);
		 Thread.sleep(20);
		 seguidores++;
		
		if (seguidores == 101) {
			System.out.println("felicidades lograste llegar a los 100 seguidores!");
	}
		}
	while (seguidores <= 100);
	}
}