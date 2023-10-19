import java.util.Scanner;

public class Vowel_Consonant {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Character");
      char ch = sc.next().charAt(0);
      // int ch = (char).System.in.read();
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

         System.out.println("Vowel");
      } else {
         System.out.println("Consonant");
         sc.close();
      }

   }
}