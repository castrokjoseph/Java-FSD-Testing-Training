package day20;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

	public static void main(String[] args) 
	{
		Deque<String> dq= new ArrayDeque<String>();
    // add() method to insert
		dq.add("To");
		dq.addFirst("Welcome");
		dq.addLast("Java");
		System.out.println(dq);
	}

}
