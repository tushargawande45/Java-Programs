

interface Interface {
	public void method1();
	public void method2();
}
class MyInterface implements Interface{
	public void method1() {
		System.out.println("Implementation of method 1");
	}
	public void method2() {
		System.out.println("Implementing method2");
	}
	
	public static void main(String args[]) {
		Interface obj = new MyInterface();
		obj.method1();
	}
}
