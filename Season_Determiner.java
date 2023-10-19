import java.util.Scanner;

public class Season_Determiner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Month");
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("Jannuary");
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("February");
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("March");
                System.out.println("Summer");
                break;
            case 4:
                System.out.println("April");
                System.out.println("Summer");
                break;
            case 5:
                System.out.println("May");
                System.out.println("Summer");
                break;
            case 6:
                System.out.println("June");
                System.out.println("Monsoon");
                break;
            case 7:
                System.out.println("July");
                System.out.println("Monsoon");
                break;
            case 8:
                System.out.println("August");
                System.out.println("Monsoon");
                break;
            case 9:
                System.out.println("September");
                System.out.println("Monsoon");
                break;
            case 10:
                System.out.println("October");
                System.out.println("Winter");
                break;
            case 11:
                System.out.println("November");
                System.out.println("Winter");
                break;
            case 12:
                System.out.println("December");
                System.out.println("Winter");
                break;
            default:
                System.out.println("Thanks You");
                break;
        }
        sc.close();
    }
}