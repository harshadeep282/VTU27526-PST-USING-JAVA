 import java.util.Scanner;

public class fibonacci {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        if (n == 0) {
            System.out.println(a);
            
        }

        if (n == 1) {
            System.out.println(b);
            
        }

        int c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println(c);
        sc.close();
    }
} 
    

