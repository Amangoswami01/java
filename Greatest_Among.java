import java.util.Scanner;
public class Greatest_Among {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
          System.out.println("Enter the second number");
        int b = sc.nextInt();
          System.out.println("Enter the third number");
        int c = sc.nextInt();
          System.out.println((a > b && a >c) ? "First number is Greater" + a : (b > c)? "Second Number is Greater" + b : "Third Number is Greater " +c );

          sc.close();
    }
    
}
