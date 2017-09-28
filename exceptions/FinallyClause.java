package exceptions;
/*In each finally block is executed no matter what. If the exception is thrown ,if the method retuns 
 * and in normal case finally is always executed. */

public class FinallyClause {
static void methA() {
	try {
		System.out.println("Inside method A");
		throw new RuntimeException("demo");
	}finally {
		System.out.println("method A finally");
	}
}

static void methB() {
	try {
	System.out.println("Inside method B");
	return;
}finally {
	System.out.println("method B finally");
	
}
}
static void methC() {
	try {
		System.out.println("Inside method C");
	}finally {
		System.out.println("method c finally");
	}
}

public static void main(String args[]){
	try {
      methA();		
	} catch(RuntimeException e) {
		System.out.println("Exception" +e);
	}
	methB();
	methC();
}













}
