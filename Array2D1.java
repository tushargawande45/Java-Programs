//find the position of number in 2-D array


import java.util.*;

public class Array2D1 {
	public static void main(String args[]) {
		System.out.println("Enter no. of rows and columns: ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols= sc.nextInt();
		
		int arr[][] = new int[rows][cols];
		
		System.out.println("Enter the array elements: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter a number you want to be search: ");
		int x = sc.nextInt();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(x==arr[i][j]) {
					System.out.println("The number found at Position "+ (i+1)+","+(j+1));
				}
			}
		}
		
	}
}
