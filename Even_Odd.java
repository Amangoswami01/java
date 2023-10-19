import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println( (n % 2 == 0) ?("Even Number") : ("Odd Number"));
        sc.close();
    }
}