package interfacedemos;

public class TestStack {
public static void main(String args[]) {
	DynamicStack mystack1 = new DynamicStack(5);
	DynamicStack mystack2 = new DynamicStack(2);
	
	for(int i=0 ; i<10 ; i++) {
		mystack1.push(i);
	}
	for(int i=0 ; i<10 ; i++) {
		mystack2.push(i);
		
	}
	System.out.println("mystack1 values");
	for(int i=0 ;i <10 ; i++) {
		System.out.println(mystack1.pop());
		
	}
	System.out.println("mystack2 values");
	for(int i=0 ; i<10 ;i++) {
		System.out.println(mystack2.pop());
	}
}
}
