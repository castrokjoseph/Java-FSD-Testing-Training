package day20;
import java.util.*;
public class IterationDequeue {

	public static void main(String[] args) {
		Deque<String> dq= new ArrayDeque<String>();

    // add() method to insert
    dq.add("To");
    dq.addFirst("Welcome");
    dq.addLast("Java");
    dq.add(", the best programming language");

    for (Iterator itr = dq.iterator();
         itr.hasNext();) {
        System.out.print(itr.next() + " ");
    }

    System.out.println();

    for (Iterator itr = dq.descendingIterator();
         itr.hasNext();) {
        System.out.print(itr.next() + " ");
    } 
	}

}
