
import java.util.*;
public class career {
	int n,fact=1;
	void gtdt() {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
	}
	void display() {
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}
		System.out.println("The Factorial of " + n + " is : " + fact);
	}
	
	public static void main(String args[]) {
		career f[] = new career[3];
		for(int i=0 ; i<3; i++) {
			f[i] = new career();
			f[i].gtdt();
			f[i].display();
		}
		
	}

}
