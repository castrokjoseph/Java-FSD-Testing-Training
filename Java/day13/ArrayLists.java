package day13;
import java.util.*;
public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
        list.add("Ravi");//Adding object in arraylist  
        list.add("Vijay");  
        list.add("Arun");  
        list.add("Ajay");  
         
        System.out.println("Traversing list through List Iterator:");  
        //Here, element iterates in reverse order  
           ListIterator<String> itr=list.listIterator(list.size());  
           while(itr.hasPrevious())  
           {  
               String str=itr.previous();  
               System.out.println(str);  
           }  
           System.out.println("Traversing list through for loop:");  
           for(int i=0;i<list.size();i++)  
           {  
            System.out.println(list.get(i));     
           }  
              
        System.out.println("Traversing list through forEach() method:");  
        //The forEach() method is a new feature, introduced in Java 8.  
            list.forEach(a->{ //Here, we are using lambda expression  
                System.out.println(a);  
              }); 
                
            System.out.println("Traversing list through forEachRemaining() method:");  
              Iterator<String> itr1=list.iterator();  
              itr1.forEachRemaining(a-> //Here, we are using lambda expression  
              {  
            System.out.println(a);  
              });  

	}

}
