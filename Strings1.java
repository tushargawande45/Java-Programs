
import java.util.*;

public class Strings1 {
	public static void main(String args[]) {
		String sentence ="My name is Tushar";
//		String subSent = sentence.substring(11,17);
//		System.out.println(subSent);
		System.out.println("Enter the inclusive range of String: ");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		while(m<=n) {
			System.out.print(sentence.charAt(m));
			m++;
		}
	}

}
