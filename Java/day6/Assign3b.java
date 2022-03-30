package day6;

public class Assign3b {

	public static void main(String[] args) {
		first:
	        for( int i = 1; i < 5; i++) {

	            second:
	            for(int j = 1; j < 3; j ++ ) {
	                System.out.println("i = " + i + "; j = " +j);
	             
	                // the break statement breaks the first for loop
	                if ( i == 2)
	                    break first;
	            }
	        }
	}

}
