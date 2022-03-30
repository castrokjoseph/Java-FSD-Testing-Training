package day13;
import java.util.*;
public class Qstn3 {

	public static void main(String[] args) {

		    List<String> firstName = new ArrayList<String>();
		    List<String> lastName = new ArrayList<String>();
		    String string1 = "ricy";
		    firstName.add(string1);
		    String string2 = "bhanu";
		    firstName.add(string2);
		    // /////inserting last name
		    String string3 = "yaksh";
		    lastName.add(string3);
		    String string4 = "mathew";
		    lastName.add(string4);

		    Iterator<String> iterator = firstName.iterator();
		    Iterator<String> iterator1 = lastName.iterator();
		    List<String> name = new ArrayList<String>();


		    while (iterator.hasNext()&& iterator1.hasNext() )
		    {

		        name.add(iterator.next()+" "+iterator1.next());
		    }

		    Iterator<String> iterator11 = name.iterator();
		    while(iterator11.hasNext())
		        System.out.println(iterator11.next());

		}
}
