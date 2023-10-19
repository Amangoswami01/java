import java.util.Scanner;

public class Traffic_Light {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char Colour;
        // int Ch, Y;

        System.out.println("Enter the Colour of the light(R,Y,G) : ");
        Colour = sc.next().charAt(0);

        switch (Colour) {
            case 'R':
            case 'r':
                System.out.println("STOP ");
                break;
            case 'Y':
            case 'y':
                System.out.println("CAUTION!");
                break;
            case 'G':
            case 'g':
                System.out.println("GO GO");
                break;
            default:
                System.out.println("The colour is not valid");
                break;

        }
        sc.close();
    }
}
