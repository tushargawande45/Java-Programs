//example of static method
//Program of changing the common property of all objects(static field).  


public class student {
	int roll;
	String name;
	static String college = "PCCOE";
	
	static void change(){
		college = "DYPIT";
	}
	student(int r , String n){
		roll = r;
		name = n;
	}
	void display() {
		System.out.println(roll + " " + name + " " + college);
	}
	public static void main(String args[]) {
		student.change();
		
		student s1 = new student(111,"Tushar");
		student s2 = new student(222,"Rohit");
		student s3 = new student(333,"Mahesh");
		
		s1.display();
		s2.display();
		s3.display();
		
	}

}
