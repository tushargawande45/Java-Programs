
import java.util.Scanner;

class Table1{
	int n;
	
	public void Scan() {
		
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	}
}
class Table extends Table1{
	public void calculate() {
		int t;
		for(int i=1;i<=10;i++) {
			t = i*n;
			System.out.print(t + " ");
		}
			
	 }
	    public static void main(String args[]) {
	    	Table obj = new Table();
	    	obj.Scan();
	    	obj.calculate();
	}
	
}