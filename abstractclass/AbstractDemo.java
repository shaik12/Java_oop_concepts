package abstractclass;

public class AbstractDemo {
	public static void main(String args[]){
		rectangle rect = new rectangle(10,20);
		System.out.println(rect.area());
		//Access concrete method "perimeter" in superclass using rectangle class object.
		System.out.println(rect.perimeter());
		triangle tri = new triangle(20.7,45.98,100);
		System.out.println(tri.area());
		System.out.println(tri.perimeter());
		
		
}
}
abstract class figure {
	double d1;
	double d2;
	
	figure(double a1,double a2) {
		d1 = a1;
		d2 = a2;
		
	}
	//Add concrete methods to abstract class 
	double perimeter() {
		return d1+d2;
	}
	
	abstract double area();
}
class rectangle extends figure {
	rectangle(double r1, double r2) {
		super(r1,r2);
		
	}
	double area() {
		System.out.println("Area of triangle :");
		return d1*d2;
	}
}
class triangle extends figure {
	double d3;
	triangle (double t1, double t2,double t3) {
		super(t1,t2);
		d3 = t3;
		
	}
	double area() {
		System.out.println("Area of triangle:");
		return d1*d2 / 2;
	}
	double perimeter() {
		return d1+d2+d3;
	}
} 



