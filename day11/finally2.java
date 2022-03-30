package day11;

public class finally2 {

	public static void main(String[] args) {
		try
		{
			int data=25/0;
			System.out.println("data="+data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	/*	catch(Exception e)//default Exception Handeler
		{
			System.out.println("there is some arithmethich Exception :"+e);
		} */
		finally
		{
			System.out.println("Finally block is always executed");
		}

		System.out.println("Rest of the code");

	}

}
