package accesscontrol1;

public class Protection {
 int n = 1;
 private int n_pri = 2;
 protected int n_pro = 3;
 public int n_pub = 4;

public Protection() {
	System.out.println("base constructor");
	System.out.println("n = " +n);
	System.out.println("n_pr= " +n_pri);
	System.out.println("n_pro = " +n_pro);
	System.out.println("n_pub =" +n_pub);
	
	
}
}
// Derived class can access all public private and protected members 
// because its derived from Protection class.
class Derived extends Protection {
	Derived() {
		System.out.println("Derived constructor");
		System.out.println("n = " +n);
		//System.out.println("n_pr= " +n_pri);
		System.out.println("n_pro = " +n_pro);
		System.out.println("n_pub =" +n_pub);
		
	}
}
class SamePack {
	SamePack() {
	Protection p = new Protection();
	System.out.println("same package constructor");
	System.out.println("n = " +p.n);
	// System.out.println("n_pri =" +p.n_pri);  n_pri is not visible as it is private.
	System.out.println("n_pub =" +p.n_pub);
	System.out.println("n_pro=" +p.n_pro);
	
	}
}