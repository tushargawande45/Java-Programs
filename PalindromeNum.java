public class PalindromeNum {
    public static void main(String[] args) {
        int num = 2345432;
        
        int reversedNum = 0 ,originalNum = num, remainder ;

        while(num != 0){
            remainder = num%10;
            reversedNum = reversedNum*10+remainder;
            num /= 10;
        }
        if(reversedNum == originalNum){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not Palindrome");
        }
    }
}
