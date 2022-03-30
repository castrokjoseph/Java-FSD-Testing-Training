package day4;

class Animal
{
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("dog barks");
	}
}
class puppy extends Dog
{
	void weep()
	{
		System.out.println("puppy is weeping");
	}
}
public class MultiLevel {

		
	public static void main(String[] args) {
		puppy obj=new puppy();
		obj.weep();
		obj.bark();
		obj.eat();

	}

}
