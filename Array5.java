//to find minimum number in array

public class Array5 {
	public static void main(String args[]) {
		int a[] = {4,3,5,2,1,6};
		
		int min = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("The Max number is " + min);
		
	}
}
