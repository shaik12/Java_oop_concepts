package designpatterns;
import designpatterns.PersonFactory;
public class FactotyTest {
	public static void main(String args[]) {
		Person[] plist = new Person[15];
		for(int x =0 ; x <= 10; x++) {
			plist[x] = PersonFactory.createMale(x);
			System.out.println(plist[x]);
		}
	   //for(int i = 0; i < plist.length; i++) {
		  // System.out.println(plist[i]);
	   //}
	}
	}


