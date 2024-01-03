//abstraction using abstract class


abstract class Car {
	abstract void run();
}

class Maruti extends Car{
	void run() {
		System.out.println("Running safely");
	}
	
	public static void main(String args[]) {
		Car obj = new Maruti();
		obj.run();
	}
}
