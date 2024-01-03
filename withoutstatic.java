
public class withoutstatic {
	int count = 0;
	withoutstatic(){
		count++;
		System.out.println(count);
	}
	public static void main(String args[]) {
		withoutstatic c1 = new withoutstatic();
		withoutstatic c2 = new withoutstatic();
		withoutstatic c3 = new withoutstatic();
	}

}
