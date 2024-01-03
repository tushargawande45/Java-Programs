

public class BinarySearch {
	public static void main(String args[]) {
		int arr[] = {2,5,7,8,12,18,25};
		int n = 2;
		int li = 0;
		int hi = arr.length-1;
		int mi = (li+hi)/2;
		while(li<=hi) {
			if(n==arr[mi]) {
				System.out.println("The Element is Present at Pos "+mi);
				break;
			}
			else if(n>arr[mi]) {
				li=mi+1;
			}
			else {
				hi=mi-1;
			}
			mi=(li+hi)/2;
		}
		if(li>hi) {
			System.out.println("Element Not Found");
		}
	}
}
