import java.util.HashSet;

public class DupliElement {
    public static void main(String[] args) {
        String arr[] = {"Java","C","C++","Python","Java"};
        boolean flag = false;

        // approach 1
        /*for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate Element Found is : "+arr[i]);
                    flag = true;
                }
            }
        }
        if(flag==false){
            System.out.println("No Duplicate Element Found");
        }  */

        // approach 2

        HashSet<String>langs = new HashSet<>();
        for(String l:arr){
            if((langs.add(l))==false){
                System.out.println("Duplicate Element Found is : "+l);
                flag = true;
            }
        }
        if(flag==false){
            System.out.println("No Duplicate Element Found");
        }
    }
}
