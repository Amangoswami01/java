import java.util.Scanner;

public class Reverse_no {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int r, sum = 0;
        while (n > 0) {
            r = n % 10; // getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        System.out.println(sum + " is  Reverse number");
        sc.close();
    }
}
