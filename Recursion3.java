//Print sum of n natural numbers using recursion



public class Recursion3 {
	public static void printSum(int i , int n , int sum) {
		if(i==n) {
			sum+=n;
			System.out.println(sum);
			return;
		}
		sum+=i;
		printSum(i+1,n,sum);
//		System.out.println(i);
		
	}

	public static void main(String args[]) {
		printSum(1,6,0);
	}

}
