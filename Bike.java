

class vehicle1 {
	vehicle1()
	{
		System.out.println("Vehicle is created");
	}
}
class Bike extends vehicle1{
	Bike(){
		super();
		System.out.println("Bike is Created");
	}
	public static void main(String args[]) {
		Bike b1 = new Bike();
	}

}
