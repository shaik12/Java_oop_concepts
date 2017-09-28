package inheritance;

public class SuperDemo {
public static void main(String args[]) {
	Shaping sh = new Shaping(10,20);
	System.out.println("Area is:" +sh.volume());
	Boxing b = new Boxing(10,20.3,8);
	System.out.println("Volume of box :" +b.volume());
	System.out.println("Height is:" +b.height);
	BigBox bb = new BigBox(9.5,4.6,78,300);
	System.out.println("Bigbox volume is:" +bb.volume());
	System.out.println("Height is:"+bb.height);
	System.out.println("weight is:" +bb.weight);
	System.out.println();
}
}
class Shaping { 
	private double length;
	private double width;
	
    
	Shaping(double l,double w) {
		length = l;
		width = w;
		
	}
	 double volume() {
		return length * width ;
	}
}
class Boxing extends Shaping {
	double height;
	Boxing(double l,double w,double h) {
		super(l,w);
		height = h;
	}
}
class BigBox extends Boxing {
	double weight;
	BigBox(double l,double w,double h,double k) {
		super(l,w,h);
		weight = k;
	}
}