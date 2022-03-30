package day13;
import java.util.*;
public class ArrayList6 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
			System.out.println("Intial list of elements"+al);
			al.add("Ravi");
			al.add("Vijay");
			al.add("Ajay");
			System.out.println("After invoking add(E e) method:"+al);
			al.add(1, "Gaurav");
			System.out.println("After adding"+al);
		
			ArrayList<String> al2=new ArrayList<String>();  
	           al2.add("Sonoo");  
	           al2.add("Hanumat");
	           al2.add("Arun");
	           al2.add("Mahesh");
	           
	           al.addAll(al2);
	           System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al);
	           
	        ArrayList<String> al3=new ArrayList<String>();  
	           al3.add("John");  
	           al3.add("Rahul");  
	           
	           al.addAll(1, al3);  
	           System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al); 
	}

}
