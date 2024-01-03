

public class statickeyword {
	int id;
	String name;
	static String College = "DYPIT";
	statickeyword(int i , String n){
		id = i;
		name = n;
	}
	void display() {
		System.out.println(id + " " + name + " " + College);
	}
	public static void main(String args[]) {
		statickeyword s1 = new statickeyword(111,"Karan");
		statickeyword s2 = new statickeyword(222,"Aryan");
		s1.display();
		s2.display();
	}

}
