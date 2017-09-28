package designpatterns;
import designpatterns.Person;
public class PersonFactory {
	
	public static Person createMale(int id) {
		return new Person(id,"M");
	}
    public static Person createFemale(int id) {
    	return new Person(id,"F");
    }
}

