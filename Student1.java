

class Person{
	void message() {
		System.out.println("welcome");
	}
}
class Student1 extends Person {
	void message() {
		System.out.println("Welcome to java");
	}
	void display() {
		super.message();
		message();
		
	}
	public static void main(String args[]) {
		Student1 S = new Student1();
		S.display();
	}

}
