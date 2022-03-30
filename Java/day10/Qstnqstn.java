package day10;

public class Qstnqstn 
{

	public static void main(String[] args) 
	{
		try 
		{
			int a[]= {'1','2','3'};
			//System.out.println(a[5]);
            try
            {
                int x = a[2] / 0;
            }
            catch (ArithmeticException e2) {
                System.out.println("division by zero is not possible");
            }
        }
        catch (ArrayIndexOutOfBoundsException e1)
		{
            System.out.println("ArrayIndexOutOfBoundsException");
		}
            System.out.println("Element  index does not exists");

	}

}
