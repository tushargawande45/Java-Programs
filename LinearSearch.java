

public class LinearSearch {

	public static void main(String args[]) {
		int arr[] = {7,8,3,1,2};
		int n = 2;
		int temp = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println("The Number is present at Index Pos "+i);
				temp++;
			}
		}
		if(temp==0) {
			System.out.println("Element is not found in array");
		}
		
	}
}
