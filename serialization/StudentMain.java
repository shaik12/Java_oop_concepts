package serialization;
import java.io.*; 

public class StudentMain {
	public static void main(String args[])throws Exception{  
		 // Student s1 =new Student(211,"ravi");  
		  
		//  FileOutputStream fout=new FileOutputStream("file.txt");  
		 // ObjectOutputStream out=new ObjectOutputStream(fout);  
		  
		 // out.writeObject(s1);  
		 
		 // System.out.println(s1.id + " " +s1.name);
		 // System.out.println("success");  
// }
	
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
		  Student s=(Student)in.readObject();  
		  System.out.println(s.id+" "+s.name);  
		  
		  in.close();  
		 }  
}