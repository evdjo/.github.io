import java.util.Scanner;


/**
 * This class finds the greatest common divisor among two numbers.
 * It uses the Eucild's Algorithm. -> http://en.wikipedia.org/wiki/Euclidean_algorithm
 * @author Evdzhan Mustafa enm3@aber.ac.uk
 *
 */
public class EucildAlgorithm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanny = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		
		long a =scanny.nextLong();
		
		System.out.println("Enter second number : ");
		
        long b =scanny.nextLong();
        
        while(b != 0) {
        	long rem = a % b ;
        	
        	a = b;
        	
        	b = rem;
        	
        }
        
        System.out.println("The greatest common divisor of those numbers is : " +a);
        scanny.close();
	}

}