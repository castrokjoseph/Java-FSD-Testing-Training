package day18;

import java.util.Hashtable;

public class Hashtable4 {

	public static void main(String[] args) {
		Hashtable<Integer,String> m=new Hashtable<Integer,String>();          
	     m.put(100,"Amit");    
	     m.put(102,"Ravi");   
	     m.put(101,"Vijay");    
	     m.put(103,"Rahul");    
	     System.out.println("Initial Map: "+m);  
	     //Inserts, as the specified pair is unique  
	     m.putIfAbsent(104,"Gaurav");  
	     System.out.println("Updated Map: "+m);  
	     //Returns the current value, as the specified pair already exist  
	     m.putIfAbsent(101,"Vijay");  
	     System.out.println("Updated Map: "+m);

	}

}
