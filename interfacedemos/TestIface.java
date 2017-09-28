package interfacedemos;

public class TestIface {
	public static void main(String args[]){
		/* Objects for the interface cannot be constructed. Interface only declares methods.
		   Objects can be constructed for the classed that implement the interface.
		   So the below statement will not work.
	       Callback c = new Callback();*/
		
		/* so the approach should be to create the reference variable of interface type.
		 * You can refer any Instance of any class that implements the interface using the interface type 
		 * reference variable */
		
		/* Here we are creating a new instance(object) of Client and using callback type reference 
		 * variable 'c' to point to it. */
		 
		/*Callback c = new Client();
		 c.callback(40);
		 Callback cb = new AnotherClient();
		 cb.callback(20);
		 c = cb;
		 c.callback(56); */
		
		Callback c;
		Client a = new Client();
		AnotherClient b = new AnotherClient();
		c = a;
		c.callback(10);
		c = b;
		c.callback(20);
		/* So here 'c' acts as reference variable of interface type and can be referred to any instance of 
		 * any class that  implements the interface.*/
		
	}

}
