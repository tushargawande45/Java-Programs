//RunTime Polymorphism Or Dynamic or Late Binding



class Bike2 {
	void run() {
		System.out.println("Running");
	}
}
class Splender2 extends Bike2{
	void run() {
		System.out.println("Running safely At the Speed of 60km/h");
	}

	public static void main(String args[]){
		Bike2 b = new Splender2();  // upcasting
		b.run();
    }
}