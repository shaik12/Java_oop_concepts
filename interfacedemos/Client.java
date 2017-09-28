package interfacedemos;

public class Client implements Callback {

	public void callback(int p) {
		System.out.println("This is Client class");
		System.out.println("Client Callback method called with" +p);
		}
	
	void nonImeth() {
		System.out.println("Classes that definr interface can have its own members too");
	}
}
