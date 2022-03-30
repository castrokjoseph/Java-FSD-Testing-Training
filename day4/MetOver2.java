package day4;

class Shape
{
	void draw()
	{
		System.out.println("Any shape can be drawn");
	}
}
class circle extends Shape
{
	void draw()
	{
		System.out.println("circle shape can be drawn");
	}
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Tiangle shape can be drawn");
	}
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Rectangle shape can be drawn");
	}
}
public class MetOver2 {

	public static void main(String[] args) {
		Shape obj=null;
		obj=new Shape();
		obj.draw();
		obj=new circle();
		obj.draw();
		obj=new Triangle();
		obj.draw();
		obj=new Rectangle();
		obj.draw();
	}

}
