package day10;

public class Qstn2 
{

	public static void main(String[] args) 
	{
		String str = "Welcome to java programming.";
	      try 
	      	{
	    	  //System.out.println(str);
	    	  	str.charAt(5);
	    	  	System.out.println("String Index is valid");
	      	} 
	      catch (StringIndexOutOfBoundsException e)
	      	{
	          System.out.println("String Index is out of bounds");
	      	}

	}

}
