import java.util.Scanner;

public class Count {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the num");
    int n = sc.nextInt();

    int count = 0;
    int temp = n;
    while (temp != 0) {
      int d = temp % 10;
      count++;
      temp = temp / 10;
    }
    System.out.println(count);
    sc.close();
  }
}