import java.util.Scanner;

public class Prime_no_range {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        // int m = 0, flag = 0;
        // m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println(i + " is  prime number");
                }
sc.close();
            }
        }

        // if (n < 2)
        // return false;

        // checking the number of divisors b/w 1 and the number n

        // if reached here then must be true

    }
}
