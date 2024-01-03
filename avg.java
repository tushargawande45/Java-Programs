
import java.util.*;

public class avg {
	
	public static void calculateAvg(float a,float b,float c) {
		float average = (a+b+c)/3;
		System.out.println(average);
		return;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		
		System.out.println("The Avg of these numbers is: ");
		calculateAvg(a,b,c);
		
	}

}
