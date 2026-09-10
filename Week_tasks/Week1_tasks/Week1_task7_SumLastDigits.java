import java.util.Scanner;

public class SumLastDigits {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int lastDigit1 = a % 10;
        int lastDigit2 = b % 10;

        int sum = lastDigit1 + lastDigit2;

        System.out.println(sum);
        sc.close();
    }
}
