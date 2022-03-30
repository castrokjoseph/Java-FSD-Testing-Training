package day3;
import java.util.Scanner;

public class PrimeLimit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int  n, i, j, flag;
        System.out.printf("\n Enter the interval: ");
        n = sc.nextInt(); 
        
        for (i = 2; i <= n; i++) {
 
            // Skip 0 and 1 as they are neither prime nor composite
            if (i == 1 || i == 0)
                continue;
            flag = 1;
 
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
 
            if (flag == 1)
                System.out.println(i);
        }
	}

}
