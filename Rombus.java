import java.util.Scanner;

public class Rombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = sc.nextInt();
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (i = 1; i <= n; i++) {
            for (j = i; j <= n; j++) {
                System.out.print(" *");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
