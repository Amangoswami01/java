import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int a = 23;
        int b = 34;
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println(a);
          System.out.println(b);
          sc.close();
    }
}
