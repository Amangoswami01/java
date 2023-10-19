import java.util.Scanner;

public class Prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int m = 0, i, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (m % 2 == 0) {
                    System.out.println(n + " is not  prime number");
                    flag = 1;
                    break;
                }
                if (flag == 0) {
                    System.out.println(n + " is  prime number");
                }
                 sc.close();
            }
        }
       
    }
}
