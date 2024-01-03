

public class MOEx1 {

	void calculate(double r) {
	double	A = (3.14 * r * r) ;
		System.out.println("Area of Circle : " + A);
	}
	void calculate(double P , double R , double T) {
		double SI = (P * R * T)/100 ;
		System.out.println("Simple Interest : " + SI);
	}
	public static void main (String args[])
	{
		MOEx1 a = new MOEx1();
		a.calculate(5.6);
		a.calculate(5000,4,8);
		
	}
}