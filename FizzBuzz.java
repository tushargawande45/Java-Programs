public class FizzBuzz {
    public static void main(String[] args) {
        int count = 50;
        for(int i=1;i<=50;i++){
            if((i%3==0 || i%5==0)||(i%3==0 && i%5==0)){
                if(i%3==0 && i%5!=0){
                    System.out.println(i+" : Fizz");
                }
                else if(i%5==0 && i%3!=0){
                    System.out.println(i+" : Buzz");
                }
                else{
                    System.out.println(i+" : FizzBuzz");
                }
            }
            else{
                System.out.println(i);
            }
        }
    }
    
}
