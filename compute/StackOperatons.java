package compute;
import java.util.Scanner;

class StackOperations {
private int st[]; 
private int idx;

void stack(int size) {
	st = new int[size];
	idx = -1;
	
}
void push(int item) {
	if(idx == st.length-1) {
		System.out.println("Stack Full");
	}
	else 
	st[++idx] = item;	
}
void pop() {
	if (idx == -1)
		System.out.print("Stack Underflow");
	else 
		st[idx] = idx - 1;
}
void show() {
	int i ; 
	for(i = 0;i <st.length;i++)
		System.out.println(i);
}
public static void main(String args[]){
	int s,i;
Scanner sc = new Scanner(System.in);
System.out.print("Enter size");
s = sc.nextInt();
StackOperations so = new StackOperations();
so.stack(s);
for(i=0;i<s;i++) 
	so.push(i);
    so.show();
}

}