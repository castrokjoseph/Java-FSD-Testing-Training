package day2;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.println("Start of the program");
		System.out.println("PLease enter a number:");
		System.out.println("1.Monday\n 2.Tuesday\n 3.Wednesday\n 4.Thursday\n 5.Friday\n");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=0;
		switch(a)
		{
			case 1:System.out.println("select your slot");
				   System.out.println("1.10am,2.11am,3.12pm");
				   b=sc.nextInt();
				   switch(b)
				   {
				   	case 1:System.out.println("your appointment is booked for 10am on Monday");
				   			break;
				   	case 2:System.out.println("your appointment is booked for 11am on Monday");
				   			break;
				   	default: System.out.println("Invalid input");
				   }
				   break;
			case 2:System.out.println("Tuesday");
					System.out.println("select your slot");
				   System.out.println("1.10am,2.11am,3.12pm");
				   b=sc.nextInt();
				   switch(b)
				   {
				   	case 1:System.out.println("your appointment is booked for 10am on tuesday");
				   			break;
				   	case 2:System.out.println("your appointment is booked for 11am on tuesday");
				   			break;
				   	case 3:System.out.println("your appointment is booked for 12pm on tuesday");
				   			break;
				   	default: System.out.println("Invalid input");
				   }
					break;
			case 3:System.out.println("wednesday");
					System.out.println("select your slot");
				   System.out.println("1.10am,2.11am,3.12pm");
				   b=sc.nextInt();
				   switch(b)
				   {
				   	case 1:System.out.println("your appointment is booked for 10am on wednesday");
				   			break;
				   	case 2:System.out.println("your appointment is booked for 11am on wednesday");
				   			break;
				   	case 3:System.out.println("your appointment is booked for 12pm on wednesday");
				   			break;
				   	default: System.out.println("Invalid input");
				   }
					break;
			case 4:System.out.println("Today is thursday");
					System.out.println("Please select your slot");
				   System.out.println("1.10am,2.11am,3.12pm");
				   b=sc.nextInt();
				   switch(b)
				   {
				   	case 1:System.out.println("your appointment is booked for 10am on Thursday");
				   			break;
				   	case 2:System.out.println("your appointment is booked for 11am on Thursday");
				   			break;
				   	case 3:System.out.println("your appointment is booked for 12pm on Thursday");
				   			break;
				   	default: System.out.println("Invalid input");
				   }
					break;
			case 5:System.out.println("Today is friday");
					System.out.println("Please select your slot");
				   System.out.println("1.10am,2.11am,3.12pm");
				   b=sc.nextInt();
				   switch(b)
				   {
				   	case 1:System.out.println("your appointment is booked for 10am on Friday");
				   			break;
				   	case 2:System.out.println("your appointment is booked for 11am on Friday");
				   			break;
				   	case 3:System.out.println("your appointment is booked for 12pm on Friday");
				   			break;
				   	default: System.out.println("Invalid input");
				   }
					break;
			default: System.out.println("Invalid Input");
					break;		
		}
		System.out.println("end of the program");

	}

}
