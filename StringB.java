

public class StringB {
	public static void main(String arg[]) {
		StringBuilder sb = new StringBuilder("Tony");
		System.out.println(sb);
		
		//Set Character at Any Index
		sb.setCharAt(0,'P');
		
		System.out.println(sb);
		
		//insert character at any index
		sb.insert(0,"hey");
		System.out.println(sb);
		
		//delete characters
		sb.delete(0, 3);
		System.out.println(sb);
		
		//append at last Index
		sb.append('H');
		sb.append('i');
		System.out.println(sb);
	}

}
