import java.util.*;
public class maximumnumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the elements one by one");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }else{
                return;
            }
        }
        System.out.println("maximum number in the array:"+max);
        sc.close();
    }
}
