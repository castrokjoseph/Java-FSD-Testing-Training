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
	System.out.println("Dog is barking");
	}
}
class Cat extends Animal{
	void meow()
	{
		System.out.println("Cat is meowing");
	}
}
public class Hierarchial {

	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.eat();
		obj.meow();

	}

}
