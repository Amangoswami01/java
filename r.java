import java.util.Scanner;

public class r {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        System.out.print("Enter Symbol : ");

        char c = sc.next().charAt(0);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)

            {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++)

            {
                System.out.print(c);
            }

            System.out.println();
        }
        // for ( int i = 1; i <= n; i++) {
        //     for (int j = n - i; j < n; j++)

        //     {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= n; j++)

        //     {
        //         System.out.print(c);
        //     }

        //     System.out.println();

        // }

        sc.close();

    }
}
