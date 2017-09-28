package inheritance;
import java.util.Scanner;
public class InheritanceDemo {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
   Rect rectangle = new Rect(10,20);
   System.out.println("Area of Rectanle is:"+ rectangle.area());
   Box b = new Box(10,20,30);
   System.out.println("Volume o box is:" + b.volume());
   Circle cir = new Circle(2.5);
   System.out.println("Area of circle is :" + cir.area());
   //Square sq1 = new Square(15.5);
   //System.out.println("Square area :" +sq1.area());
   Shape sh = new Shape();
   sh.innerOb();
	}
	}
class Shape {                      
	double length;     
	double width;
    final double pi = 22.7;
    void innerOb(){          //method to access inner class method "area" by outer class object.
    	Square sq = new Square(10);
    	System.out.println("Area of square is: " +sq.area());
    	
    }

    class Square extends Shape {
    	Square(double l){
    		length = l;
    	}
    	double area() {
    		return length*length;
    	}
}
}



class Rect extends Shape {
Rect(double l,double w){
	length = l;
	width = w;
}
double area() {
return  length*width ;	
}
}
class Box extends Shape {
	double height;
	Box(double l,double w,double h){
		length = l;
		width = w; 
		height = h; 
}
	double volume() {
		return length*width*height;
	}
}
class Circle extends Shape {
	double radius;
	Circle(double r){
		radius = r;
}
	double area(){
		return pi*radius*radius;
	}
}