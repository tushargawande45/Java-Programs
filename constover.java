

class constover {
	int id;
	String name;
	int age;
	constover(int a,String b){
		id = a;
		name = b;
	}
	constover(int p,String q,int r){
		id = p;
		name = q;
		age = r;
	}
	void display(){
		System.out.println(id + " " + name + " " + age);
	}
	public static void main(String args[]) {
		constover s1 = new constover(111,"Rohit");
		constover s2 = new constover(222,"Mahesh",20);
		s1.display();
		s2.display();
	}

}
