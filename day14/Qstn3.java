package day14;
import  java.io.*;
import java.io.FileReader;
public class Qstn3 {

	public static void main(String[] args) throws IOException 
	{
		try {
		FileReader file=new FileReader("C:\\Users\\JERIN\\eclipse-workspace\\JAVAPROJECTS\\Qstn1.txt");
		int data=file.read();
		while(data!=-1) {
			System.out.print((char)data);
			data=file.read();
		}
		file.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
        
	}
}

