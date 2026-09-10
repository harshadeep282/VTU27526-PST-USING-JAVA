import java.util.*;
public class accessingelements {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        System.out.println("enter the array elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the index:");
        int index=sc.nextInt();
        if(index<n){
            System.out.println("number at the index is:");
        System.out.println(arr[index]);
        }else{
            System.out.println("index is out of bounds");
        }

sc.close();
    }
}
