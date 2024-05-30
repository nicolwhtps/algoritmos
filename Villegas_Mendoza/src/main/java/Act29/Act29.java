package Act29;

public class Act29 {

	public static void main(String[] args) throws InterruptedException {
		
		for (int bat=100; bat>=0; bat--) {
			
		    System.out.println(bat+"% Bateria");
		    Thread.sleep(20);
		    
		    if (bat ==20) {
		    	System.err.println("Bateria baja.");
		    	Thread.sleep(1000);
		    }  
		    else if (bat == 0) {
		    	System.err.println("Bateria agotada.");
		    }
		}
}
}
//El for tiene menos lineas de codigo por que se puede declarar una variable dentro de el y la condincion.
//haciendo que ocupemos menos lineas de codigo.