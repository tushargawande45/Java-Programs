

class copyconst{
	int id;
	String name;
	
	copyconst(int a , String b)
	{
		id = a;
		name = b;
	}
	copyconst(copyconst c){
		id = c.id;
		name = c.name;
	}
	void display() {
		System.out.println(id + " " + name);
	}
	public static void main(String args[]) {
		copyconst c1 = new copyconst(111,"Tushar");
		copyconst c2 = new copyconst(c1);
		c1.display();
		c2.display();
		
	}
}
