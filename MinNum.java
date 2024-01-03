public class MinNum {
    public static void main(String args[]){
        int arr[] = {30,10,20,50,60};
        int min = arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    
}
