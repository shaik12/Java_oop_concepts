package exceptions;

public class ThrowException {
	/*The exception is explicitly created using throw keyword. "new" is used to create an instance of null pointer exception.
	 * Java's runtime exceptions have two constructors one with argument and the other with no argument.
	 * When you use the one with argument you have to specify the exception as a string in its argument and that becomes the exception.
	  */
	static void demothrow() {
		/*In this demo you are creating an exception called "Explicit exception"  and this becomes the exception object and 
		 *  and is passed to catch block. catch catches the exception prints message and throws it again to the 
		 *  method caller which is in the main method.*/
		try {
			throw new NullPointerException("Explicit exception");
			} catch(NullPointerException e) {
				System.out.println("Cought inside demothrow" +e);
				throw e;
			}
	}


public static void main(String args[]) {
try {
	ThrowException.demothrow();
	
}catch(NullPointerException e) {
	System.out.println("Recaught in main method" +e);
}
}
}