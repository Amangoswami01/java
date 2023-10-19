import java.util.Scanner;

public class triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the tri");
        int row = sc.nextInt();
        int i, j;
        for (i = 1; i <= row; i++) {
            for (j = i; j <= row; j++) {
                System.out.print("*");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (i = 1; i <= row; i++) {
            for (j = i; j <= row; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
