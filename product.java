
import java.util.*;

public class product {
	public static int calculateMul(int x,int y) {
		return x*y;
	}
	
	public static void main(String args[])
	{
		System.out.println("Enter Two Numbers: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("Product of two numbers is: "+x*y);
	}
}
