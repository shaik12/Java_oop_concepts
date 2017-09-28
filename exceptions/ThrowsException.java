package exceptions;
/* Throws keyword is used to list all the exceptions that a method could throw so that the caller of the method 
 * can know that it needs to handle all those exceptions.*/
public class ThrowsException {
 static void throwOne() throws IllegalAccessException {
	 System.out.println("Inside ThrowOne");
	 throw new IllegalAccessException("Explicit Exception");
	}
public static void main(String args[]) {
	try {
	throwOne();
	}catch(IllegalAccessException e) {
		System.out.println("cought exception" +e);
	}
}
}
