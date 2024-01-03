//Take an array of numbers as input and check if it is an array sorted in ascending order.

import java.util.*;
public class Array3 {
	public static void main(String args[]) {
		System.out.println("Enter the size of Array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the Array elements: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		boolean isAscending = true;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				isAscending = false;
				break;
			}
		
		}
		
		if(isAscending) {
			System.out.println("The given Array is in Ascending Order");
		}
		else {
			System.out.println("The given Array is not in Ascending Order");
		}
	}
	
}
