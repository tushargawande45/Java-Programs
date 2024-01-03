

public class Pattern11 {
	public static void main(String args[]) {
		int n=5;
		int count =5;
		for(int i=1;i<=n;i++) {
			int spaces=i-1;
			for(int j=1;j<=spaces;j++) {
				System.out.print(" ");
			}
			for(int j=count;j>=1;j--) {
				System.out.print("*"+" ");
			}
			count--;
			System.out.println();
		}
	}

}
