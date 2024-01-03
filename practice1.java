
import java.util.*;

public class practice1{
	public static void main(String args[]) {
//		System.out.println("Enter an Input Character: ");
//		Scanner sc = new Scanner(System.in);
//		char ch = sc.next().charAt(0);
//		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
//			System.out.println("Entered Character is an Alphabet");
//		}
//		else if(ch>='0' && ch<='9') {
//			System.out.println("Entered Character is a Number");
//		}
//		else {
//			System.out.println("Entered number is a special symbol");
//		}
		
		
		
//		System.out.println("Enter Three Numbers: ");
//		Scanner sc = new Scanner(System.in);
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		int n3 = sc.nextInt();
//		
//		if(n1>n2) {
//			if(n1>n3) {
//				System.out.println(n1 + " is Greater");
//			}
//			else {
//				System.out.println(n3 + " is Greater");
//			}
//		}
//		else {
//			if(n2>n3) {
//				System.out.println(n2 + " is Greater");
//			}
//			else {
//				System.out.println(n3 + " is Greater");
//			}
//		}
		
		
//		int a[] = new int[10];
//		int n;
//		System.out.println("Enter a array size : ");
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		System.out.println("Enter each element: ");
//		
//		for(int i=0; i<n ;i++) {
//			a[i] = sc.nextInt();
//		}
//		System.out.println("The array is : ");
//		for(int i=0; i<n; i++) {
//			System.out.println(a[i]);
//		}
		
		
//		int a[]=new int[10];
//		System.out.println("Enter How many Elements do you want to store: ");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		System.out.println("Enter Each element in Array: ");
//		for(int i=1 ; i<=n; i++) {
//			a[i]=sc.nextInt();
//		}
//		System.out.println("The reverse array is: ");
//		for(int i=n;i>0;i--) {
//			System.out.println(a[i]);
//		}
		
		
//		int a[]=new int[10];
//		int sum = 0;
//		System.out.println("Enter How many Elements do you want to store: ");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		System.out.println("Enter Each element in Array: ");
//		for(int i=1 ; i<=n; i++) {
//			a[i]=sc.nextInt();
//			sum = sum + a[i];
//		}
//		System.out.println("The Sum is: "+ sum);
		
		
//		int a[][] = new int[10][10];
//		System.out.println("Enter a size of array m x n: ");
//		Scanner sc = new Scanner(System.in);
//		int m = sc.nextInt();
//		int n = sc.nextInt();
//		
//		System.out.println("Enter each element: ");
//		for(int i=1; i<=m;i++) {
//			for(int j=1; j<=n; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}
//		System.out.println("The Array is: ");
//		for(int i=1; i<=m;i++) {
//			for(int j=1; j<=n; j++) {
//				System.out.print(a[i][j]);
//			}
//			System.out.println();
//		}
		
		
//		System.out.println("Enter a number till we have to print the sum: ");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int a = 1;
//		int sum = 0;
//		while(a<=n) {
//			sum = sum+a;
//			a=a+1;
//		}
//		System.out.println("The sum is " + sum);
		
		
//		To Print This Pattern
//		*****
//		*****
//		*****
//		*****
//		*****
//		Program: 
//		System.out.println("Enter a number");
//		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		for(int i=1; i<=n; i++) {
//			for(int j = 1; j<=n ; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
//		To Print This Pattern
//		*
//		**
//		***
//		****
//		*****
		
//		Program: 
//		System.out.println("Enter a number");
//		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		for(int i=1; i<=n; i++) {
//			for(int j = 1; j<=i ; j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j = i; j<i ; j++){
				System.out.print(i+j);
			}
			System.out.println();
		}
	}
}





		
		
		