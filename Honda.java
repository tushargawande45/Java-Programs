//Abstraction



abstract class Bike5 {
	abstract void run();
		
}	
class Honda extends Bike5 {
	void run() {
		System.out.println("Driving Safely");
	}

public static void main(String args[]) {
	Bike5 b = new Honda();
	b.run();
	
	}
}
