

public class string {
	public static void main(String args[]) {
		String S1 = "Tushar";
//		creating a string using a new keyword
//		char ch[] = {'s','t','r','i','n','g'};
//		String S2 = new String(ch);
//		String S3 = new String("Gawande");
//		
//		System.out.println(S1);  
//		System.out.println(S2);  
//		System.out.println(S3); 
		
		String S4 = "Rohit";
		String S5 = "Rohit";
		String S6 = new String ("Rohit");
		String S7 = "Pranay";
//		
//		System.out.println(S4.equals(S5));
//		System.out.println(S4.equals(S6));
//		System.out.println(S4.equals(S7));
//		
//		System.out.println(S4==S5);
//		System.out.println(S4==S6);
		
		System.out.println(S4.compareTo(S5));
		System.out.println(S4.compareTo(S6));
		System.out.println(S4.compareTo(S7));
	}
}
