
import java.util.Scanner;
public class ifelse {
	public static void main(String args []) {
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}
	}
}
