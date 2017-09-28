package interfacedemos;

public class AnotherClient implements Callback {
	
	public void callback(int p) {
		System.out.println("This is AnotherClient class");
		System.out.println("AnotherClient Callback calles with " +p); 
		
		
	}

}
