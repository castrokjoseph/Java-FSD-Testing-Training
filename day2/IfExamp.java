package day2;

public class IfExamp {

	public static void main(String[] args) {
		int a=10,b=10,c=70;
		if(a==b){
			System.out.println("a is equal to b");
		}
		else if(a==c)
		{
			System.out.println("a is equal to c");
		}
		else if (b==c) {
			System.out.println("b is equal to c");
		}
		else
		{
			System.out.println("none of the numbers are equal");
		}
		System.out.println("end of the program");
	}

}
