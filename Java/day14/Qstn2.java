package day14;
import java.io.*;
public class Qstn2 {

	public static void main(String[] args) {
		
			File f=new File("C:\\Users\\JERIN\\eclipse-workspace\\JAVAPROJECTS\\Qstn1.txt");
			if(f.exists())
			{
				System.out.println("File Name       :"+f.getName());
				System.out.println("File Path       :"+f.getAbsolutePath());
				System.out.println("File Free Space :"+f.getFreeSpace());
				System.out.println("File Writable   :"+f.canRead());
				System.out.println("File Readable   :"+f.canWrite());
				System.out.println("File useSpace   :"+f.getUsableSpace());
				
				System.out.println("File TotalSpace :"+f.getTotalSpace());
			}
			else
			{
				System.out.println("file doesn exists");
			}
	}

}
