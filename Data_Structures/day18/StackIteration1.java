package day18;
import java.util.*;
public class StackIteration1 {

	public static void main(String[] args) {
		Stack<String> stk = new Stack<>();  
		//pushing elements into stack  
		stk.push("BMW");  
		stk.push("Audi");  
		stk.push("Ferrari");  
		stk.push("Bugatti");  
		stk.push("Jaguar");  
		//iteration over the stack  
		Iterator<String> iterator = stk.iterator();  
		while(iterator.hasNext())  
		{  
		Object value= iterator.next();  
		System.out.println(value);   
		}     
		String temp=stk.peek();
		System.out.println("The top elements is:"+temp);

	}

}
