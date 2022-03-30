package day4;

class abcd
{
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	void sum(int a,int b,int c,int d)
	{
		System.out.println(a+b+c+d);
	}
}

public class Qstn3a {
	

	public static void main(String[] args) {
		abcd obj=new abcd();
		obj.sum(20, 20);
		obj.sum(23, 12, 50);
		obj.sum(10,10,10,10);
	}

}
