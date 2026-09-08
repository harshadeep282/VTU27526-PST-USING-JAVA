
import java.util.*;

public class sumofevendigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int evennumber=0;
        int oddnumber=0;
        
        while(n>0){
            int digit=n%10;
            if(digit%2==0){
                 evennumber+=digit;
            }else{
                oddnumber+=digit;
            }
            n=n/10;
        }
        System.out.println("sum of even digits is:"+evennumber);
        System.out.println("sum of odd digit numbers is:"+oddnumber);
        sc.close();
    }
}
    

