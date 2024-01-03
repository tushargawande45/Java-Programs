
public class copywithoutconst {
	int id;
	String name;
	copywithoutconst(int a, String b){
		id = a;
		name = b;
	}
	copywithoutconst()
	{
		
	}
	void display() {
		System.out.println(id + " " + name);
	}
	public static void main(String args[]) {
		copywithoutconst c1 = new copywithoutconst(111,"Tushar");
		copywithoutconst c2 = new copywithoutconst();
		c2.id = c1.id;
		c2.name = c1.name ;
		c1.display();
		c2.display();
	}
}
