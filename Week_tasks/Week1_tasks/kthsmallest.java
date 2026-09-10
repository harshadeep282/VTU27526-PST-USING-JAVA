import java.util.*;
public class kthsmallest {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr={8,2,4,6,0,1};
        int k=sc.nextInt();
        for(int i=0;i<6;i++){
            for(int j=i+1;j<6;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("kth smallest element is:"+arr[k-1]);
        sc.close();
    }

    
}
