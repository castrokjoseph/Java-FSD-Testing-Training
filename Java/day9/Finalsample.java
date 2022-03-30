package day9;

final class Sample
{
	void run()
	{
		System.out.println("run method in Sample");
	}
}
public class Finalsample extends Sample {
	void run()
	{
		System.out.println("run method in FinalExmp3");
	}
	public static void main(String[] args) {
		Finalsample a=new Finalsample();
		a.run();

	}

}
