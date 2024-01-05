import java.util.*;
public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to be check: ");
        int number = sc.nextInt();
        int originalNum ,remainder,result=0;

        originalNum = number;
        while(originalNum !=0){
            remainder = originalNum%10;
            result+= Math.pow(remainder,3);
            originalNum/= 10;
        }
        if(result == number){
            System.out.println(number + " is Armstrong Number");
        }
        else{
            System.out.println(number + " is Armstrong not Number");
        }

    }
    
}
