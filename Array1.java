//search an array element and print its index.
import java.util.*;

public class Array1 {
	public static void main(String args[]) {
		int a[] = {1,4,5,8,2,6};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number from array that you  want to search");
	    int n = sc.nextInt();
	    
	    for(int i=0;i<a.length;i++) {
	    	if(a[i]==n) {
	    		System.out.println(n+ " Found at index "+ i);
	    	}
	    	
	    	
	    }
		
	}

}
