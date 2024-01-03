import java.util.Scanner;

public class MissingNumber {
    public static void main(String args[]){

        //Array Should not have Duplicates
        //Array no need to be in sorted order
        //value should be in range
   
        int arr[] = {1,2,3,4,6,7,8,9,10};
        int sum1=0;
        int sum2=0;
        
        
        for(int i=0;i<arr.length;i++){
            sum1+=arr[i];
        }
        for(int i=1;i<=10;i++){
            sum2+=i;
        }
        int sum3=sum2-sum1;
        System.out.println(sum3);
    }
    
}
