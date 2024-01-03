
import java.util.*;

public class GCDUsingThis {
	int a;
	int b;
	
	GCDUsingThis(int a,int b){
		this.a=a;
		this.b=b;
	}
	void calculate() {
		
			for(int i=a ;i>0;i--) {
				if(a%i==0 && b%i==0) {
					System.out.println("GCD of " + a + " & " + b + " is " + i);
					break;
				}
			}
		}
	
public static void main(String args[]) {
	GCDUsingThis s1 = new GCDUsingThis(18,12);
	s1.calculate();
}	

}