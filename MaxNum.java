public class MaxNum{
    public static void main(String arg[]){
        int arr[] = {30,10,20,50,60};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}