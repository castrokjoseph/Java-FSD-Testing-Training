package day4;

class pqrs
{
	void dis(int a, double b)
	{
		System.out.println(a+b);
	}
	void dis(double a,double b)
	{
		System.out.println(a+b);
	}
	void dis(long a,int b,double c) 
	{
		System.out.println(a+b+c);	
	}
}
public class Qstn3b {

	public static void main(String[] args) {
		pqrs obj=new pqrs();
		obj.dis(2.2, 5.6);
		obj.dis(5, 5.5);
		obj.dis(1234, 10, 6.60);

	}

}
