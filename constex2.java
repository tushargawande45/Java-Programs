
// calculate Simple interest using parameterized constructor


class constex2 {
	double p,r,t,SI;
	constex2(double a,double b,double c){
		p = a;
		r = b;
		t = c;
	}
	void display() {
		SI = (p*r*t)/100;
		System.out.println("SI = " + SI);
	}
	public static void main(String args[]) {
		constex2 s = new constex2(12000,7,4);
		s.display();
		
	}
}
