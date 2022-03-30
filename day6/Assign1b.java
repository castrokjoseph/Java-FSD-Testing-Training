package day6;

interface color
{
	void display();
}
class sketch implements color
{
	sketch()
	{
		System.out.println("this is a type of color");
	}
	public void display()
	{
		System.out.println("sketch pens");
	}
}
class crayons implements color
{
	crayons()
	{
		System.out.println("this is type2 of color");
	}
	public void display()
	{
		System.out.println("pencil caryons");
	}
}
public class Assign1b {

	public static void main(String[] args) {
		color c=null;
		c=new sketch();
		c.display();
		c=new crayons();
		c.display();
	}

}
