package day6;

public class BreakTest {

	public static void main(String[] args) {
		hello:
			for(int a=1; a<3; a++)
			{
			   System.out.print("Hello");
			int i = 1;
			if(i==1)
				break hello;
			}
			System.out.println("Not reachable");
			

	}

}
