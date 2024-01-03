

public class Recursion4 {
	public static int CalFact(int n) {
		if(n==1 || n==0) {
			return 1;		
		}
		int fact_nm1 = CalFact(n-1);
		int fact_n = n*fact_nm1;
		return fact_n;
//		System.out.println(fact);
		
	}
	public static void main(String args[]) {
		int n =5;
		int fact = CalFact(n);
		System.out.println(fact);
	}

}
