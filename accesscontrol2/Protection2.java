package accesscontrol2;

public class Protection2 extends accesscontrol1.Protection {
	Protection2() {
		System.out.println("derived from Proetction1 class from other package");
		// System.out.println("n =" +n); Default is invisible in other package 
		// System.out.println("n_pri=" +n_pri); Private is invisible anywhere
		System.out.println("n_pro =" +n_pro);
		System.out.println("n_pub=" +n_pub);
		
	}
 
	
}
