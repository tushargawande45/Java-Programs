
// calculate Factorial using Default constructor

import java.util.Scanner;


class constex {
	int n , fact=1;
	constex(){
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of " + n + " is " + fact);
	}
	public static void main(String args[]) {
		constex f = new constex();
	}

}
