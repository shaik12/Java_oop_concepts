package exceptions;
/* Single try block can have multiple catch blocks. When an exception occurs the type of exception is matched with 
 * the catch block and appropriate catch block us chosen.
 * A catch block with exception subclass must always take precedence over exception  superclass 
 * because superclass exception catch block will handle all the exceptions and the exception subclass catch block 
 *  becomes unreachable and this causes an error. SO its important to write a catch block of ArithmeticException subclass
 *  before Exception super class.*/

public class MultipleCatches {
	/* Demonstrate Exception*/
	public static void main(String[] args) {
		try {
		int a = args.length; 
		System.out.println("a =" +a);
		int b = 42 / a; 
		int c[] = {1};
		c[99] = 34;
		}
        catch(ArithmeticException e) {
        	System.out.println("Exception:" +e);
        }
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception e");
		}
		
		}
		
		
	}


