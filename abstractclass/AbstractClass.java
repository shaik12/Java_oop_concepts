package abstractclass;
//Simple demo of abstract class
public class AbstractClass {
 public static void main(String args[]){
	 B b = new B();
	 b.callme();
	 b.callmetoo();
 }
 
}
abstract class A {
	abstract void callme();
	// concrete methods(method that has complete definition) can also be used in abstract classes.
	void callmetoo() {
		
		System.out.println("This is concrete method");
	}
	
}
class B extends A {
	void callme() {
		System.out.println("B's implementation of callme()");
	}
}