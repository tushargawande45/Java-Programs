import java.util.*;
public class PalindromeString {
    
    public static void main(String[] args) {
        String str = "Radar";
        String revStr = "";

        for(int i= str.length()-1;i>=0;i--){
            revStr = revStr + str.charAt(i);
        }
        if(str.toLowerCase().equals(revStr.toLowerCase())){
            System.out.println("Given String is Palindrome");
        }
        else{
            System.out.println("Given String is not Palindrome");
        }

    }
}

