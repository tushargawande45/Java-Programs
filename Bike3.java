//super is used to refer immediate parent class instance variable.

class vehicle{
	int speed = 50;
}
class Bike3 extends vehicle {
	int speed = 100;
	
	void display() {
		System.out.println(super.speed);
	}
	public static void main(String args[]) {
		Bike3 b1 = new Bike3();
		b1.display();
	}

}
