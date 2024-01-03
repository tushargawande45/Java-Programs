
public class withstatic {
	static int count = 0;
	withstatic(){
		count++;
		System.out.println(count);
	}
	public static void main(String args[]) {
		withstatic c1 = new withstatic();
		withstatic c2 = new withstatic();
		withstatic c3 = new withstatic();
	}

}
