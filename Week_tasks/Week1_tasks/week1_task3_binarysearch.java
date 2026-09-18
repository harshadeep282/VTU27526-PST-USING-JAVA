import java.util.*;
public class binarysearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6};
        System.out.println("enter the element want to be searched:");
        int n=sc.nextInt();
        int low=0;
        int high=arr.length-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==n){
                System.out.println("element found at:"+mid);
                return;
            }else if(arr[mid]>n){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        
        
    }
    
}
