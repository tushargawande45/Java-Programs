
import java.util.*;
public class ifelseifelse {
	public static void main(String args[]) {
		System.out.println("Enter a Character : ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
			System.out.println("Character");
		}
		else if(ch>='0' && ch<='9')  {
			System.out.println("number");
		}
		else {
			System.out.println("Special Symbol");
		}
		
	}
}
