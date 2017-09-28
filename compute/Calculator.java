package compute;
import java.lang.*;
import java.util.Scanner;
 public class Calculator {
 private float a,b,res;
 Calculator(float x, float y) {
	a = x ;
	b = y;
 }

 float add(Calculator c){
	 res = c.a + c.b;
	 return res;
	
}
}
class TestCalc { 
	
	public static void main(String args[]) {
		Scanner sc =  new Scanner(System.in);
		float i,j;
		System.out.println("Enter First Parameter"); 
		i = sc.nextFloat();
		System.out.println("Enter Second Parameter");
		j = sc.nextFloat();
		Calculator c = new Calculator(i,j);
	    System.out.println("Result is :" + c.add(c));
		sc.close();
}
	
}