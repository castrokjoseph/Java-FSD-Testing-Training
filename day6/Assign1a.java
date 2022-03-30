package day6;

abstract class assign
{
	void dispaly()
	{
		System.out.println("this is an non abstract method");
	}
	abstract void dis();
	abstract void play();

}
class assignment extends assign
{
	void dis()
	{
		System.out.println("this is dis method of abstract method");
	}
	void play()
	{
			System.out.println("this is play method of 2nd abstract method");
	}
}
public class Assign1a {

	public static void main(String[] args) {
		assignment obj=new assignment();
		obj.dis();
		obj.play();
		obj.dispaly();
		
	}

}
