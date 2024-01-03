//take a number and reverse it using Inheritance

import java.util.*;

class ABC {
	int n;
	int remainder,reverse=0;
	void gtdt() {
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
	}

}
class XYZ extends ABC {
	void display() {
		for(;n!=0;n=n/10) {
			remainder = n%10;
			reverse = (reverse*10) + remainder;
		}
		System.out.println(reverse);
	}
public static void main(String args[]) {
	XYZ obj = new XYZ();
	obj.gtdt();
	obj.display();
	
}
}
