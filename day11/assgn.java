package day11;

public class assgn {
	
	public void display() throws Exception{
		Class.forName("jaya");
	}
	public static void main(String[] args) throws Exception{
		
		String str = "Scientech Easy"; 
		 int x[ ] = {0, 1, 2, 3, 4}; 
		try // Outer try block 
			{ 
				
				try // Inner try block 
					{ 
					int y = 6; 
					System.out.println(x[y]); 
					} 
						catch(ArrayIndexOutOfBoundsException aie) 
					{
		  System.out.println("Exception is thrown"); 
		  System.out.println(aie.toString()); 
					} 
				try
				{
					throw new Exception();
				}
				catch(Exception e)
				{
					System.out.println("throw block executed");
					e.printStackTrace();
				}
		} 
		catch(NullPointerException n) 
			{ 
				System.out.println("Exception is thrownnn "); 
				System.out.println(n.toString()); 
			} 
		
		finally
		{
			System.out.println("Finally block is always executed");
		}
		
	}

}
