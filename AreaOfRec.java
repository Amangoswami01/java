import java.util.Scanner;
public class AreaOfRec {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the l number");
         int l = sc.nextInt();
          System.out.println("Enter the b number");
         int b = sc.nextInt();
         System.out.println("Area " + l * b);
         sc.close();
    }

}
