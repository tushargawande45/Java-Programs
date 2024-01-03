//Find the maximum & minimum number in an array of integers. 


import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Array2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
			System.out.print("Enter size of array: ");
			int size = sc.nextInt();
			int arr[] = new int[size];
			System.out.print("Enter the array Elements: ");
			for(int i=0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			System.out.print("The Array is { ");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+ " ");
			}
			System.out.println("}");
			
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>max) {
					max = arr[i];
					System.out.println(max);
				}
				
				if(arr[i]<min) {
					min = arr[i];
					System.out.println(min);
				}
			}
			
			System.out.println("Max number is : "+ max);
			System.out.println("Min number is : "+ min);
		
	}
	

}
