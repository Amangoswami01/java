import java.util.Scanner;

public class Square {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the square");
    int size = sc.nextInt();
    for (int i = 1; i <= size; i++) {
      for (int j = 1; j <= size; j++) {

        System.out.print("*");
      }
      System.out.println("");
    }
    sc.close();
  }
}
