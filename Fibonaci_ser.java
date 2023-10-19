import java.util.Scanner;

public class Fibonaci_ser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int f = 0;
        int s = 1;
        int i, next;
        System.out.println("FIBONACI SEQUENCE :");
        System.out.print(f + " " + s + " ");

        for (i = 2; i < n; i++) {
            next = f + s;
            System.out.print(next + " ");
            f = s;
            s = next;
            sc.close();
        }

    }
}
