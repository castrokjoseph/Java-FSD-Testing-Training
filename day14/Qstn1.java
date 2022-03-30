package day14;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class Qstn1 {

	public static void main(String[] args) {
		try 
		{
			File file=new File("Qstn1.txt");
		
			if(!file.exists()) 
			{
			
				file.createNewFile();
			} 
			//content for file
			PrintWriter pw= new PrintWriter(file);
			pw.println(" here is the content");
			pw.println("file exists");
			pw.close();
			System.out.println("Done");
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
