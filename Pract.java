

public class Pract{
	
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int target = 1;
		int si = 0;
		int ei = arr.length-1;
		int mi = (si+ei)/2;
		
		while(si<=ei) {
			if(target == arr[mi]) {
				System.out.println("The number is present at idx: " + mi);
				break;
			}
			else if(target > arr[mi]) {
				si = mi+1;
			}
			else {
				ei = mi-1;
			}
			mi = (si+ei)/2;
		}
		if(si>ei) {
			System.out.println("The number is not found in given array");
		}
	}
	
}
