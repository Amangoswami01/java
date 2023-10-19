import java.util.Scanner;

public class Digit_sum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int n = sc.nextInt();

    int temp = n;
    int sum = 0;
    while (temp != 0) {
      int digit = temp % 10;
      sum += digit;
      temp = temp / 10;
    }
    System.out.println(sum);
    sc.close();
  }
}
