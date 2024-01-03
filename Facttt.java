
import java.util.*;
;
public class Facttt {
	
	public static int calculateFact(int n) {
		int fact = 1;
		for(int i=n;i>=1;i--) {
			fact = fact*i;
		}
		return fact;
	}
	public static void main(String args[]) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("The factorial of number is: "+ calculateFact(n));
	}
}
