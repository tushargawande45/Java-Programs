

public class Pattern12 {
	public static void main(String args[]) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			}
			int spaces = n-i;
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=1;i<=n-1;i++) {
			for(int j=n-i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
