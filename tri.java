import java.util.Scanner;

public class tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the tri");
        int row = sc.nextInt();
        int i, j;
        for (i = 0; i < row; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
