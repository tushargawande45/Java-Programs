

public class MethodOverloading {
	int c;
	void sum(int a , int b) {
		
		System.out.println("The Sum is : " + (a+b));
	}
	void sum(int a ,int b ,int c) {
		
		System.out.println("The sum is : " + (a+b+c));
	}
	public static void main(String args[]) {
	MethodOverloading s = new MethodOverloading();
	s.sum(2,3);
	s.sum(33,43,51);
	}
}
