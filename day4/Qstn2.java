package day4;

class A
{
	void dis()
	{
		System.out.println("display the emthod of class A");
	}
}
class B extends A
{
	void dis()
	{
		System.out.println("display the method of class B");
	}
}
class C extends A
{
	void dis()
	{
		System.out.println("display the method of class C");
	}
}
public class Qstn2 {

	public static void main(String[] args) {
		A obj=new A();
		obj.dis();
		//B ob=new B();
		//ob.dis();
		//C bj=new C();
		//bj.dis();
		
	}

}
