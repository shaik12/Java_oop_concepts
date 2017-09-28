package interfacedemos;

public class DynamicStack implements IntStack {
	private int stack[];
	private int tos;
	
	DynamicStack(int s) {
		stack = new int[s];
		tos = -1;
	}
	
	public void push(int item) {
		if(tos == stack.length-1) {
			System.out.println("Stack is full");
		 int temp[];
		 temp = new int[stack.length*2];
		 for(int i=0 ; i<stack.length-1 ; i++) {
			 temp[i] = stack[i];
		 }
		 stack = temp;
		 
		 
		 temp[++tos] = item;
		}
		 
	   else 
	   stack[++tos] = item;
	}
	
	public int pop() {
	if(tos == -1) {
		System.out.println("Stack underflow");
	    return 0;
	}
	else 
		return stack[tos--];
	}
	
	

}
