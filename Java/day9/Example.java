package day9;

public class Example {
	final void test()
	{
		System.out.println("test method in Example class");
	}
}
class FinalExmp2 extends Example
{
	void test()
	{
		System.out.println("test method in FinalExmp2 class");
	}

	public static void main(String[] args)
	{
		FinalExmp2 a=new FinalExmp2();
		a.test();
	}

}
